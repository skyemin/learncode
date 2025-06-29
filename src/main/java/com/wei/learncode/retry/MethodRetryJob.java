package com.wei.learncode.retry;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class MethodRetryJob {

    @Autowired
    private IMethodInfoRepository methodInfoRepository;

    @Autowired
    private Environment environment;

    @Scheduled(cron = "5 * * * * ?")
    public void retry() throws UnknownHostException {
        //LoggerUtil.info(log, "*********************  MethodRetryJob start  *********************");

        Date currentDate = new Date();
        String hostAddress = InetAddress.getLocalHost().getHostAddress();
        List<MethodInfoDO> waitRetryMethod = methodInfoRepository.getListByStatusAndDate(RetryStatusEnum.RETRYING, currentDate, hostAddress);
        // todo 可以优化成多线程处理
        waitRetryMethod.forEach(methodInfoDO -> {
            //TenantUtils.setTenant(methodInfoDO.getTenantId());
            if (methodInfoDO.getCurrentRetryTimes() >= methodInfoDO.getRetryTimes()) {
                //LoggerUtil.warn(log, "重试次数已达上限, 跳过重试");
                methodInfoRepository.removeById(methodInfoDO);
                return;
            }

            try {
                TaskInfo taskInfo = TransferUtil.transfer2Task(methodInfoDO);
                boolean retrySuccess = taskInfo.retry();
                // 更新重试次数
                methodInfoDO.setCurrentRetryTimes(methodInfoDO.getCurrentRetryTimes() + 1);
                // 根据重试结果更新数据库状态
                updateDatabaseStateAfterRetry(methodInfoDO, retrySuccess);
            } catch (Exception e) {
                //LoggerUtil.error(log, e, "********** 重试非核心动作失败, 人工介入! **********");
            } finally {
                //TenantUtils.clearTenantId();
            }
        });

        //LoggerUtil.info(log, "*********************  MethodRetryJob end  *********************");
    }

    private void updateDatabaseStateAfterRetry(MethodInfoDO methodInfoDO, boolean retrySuccess) {
        if (retrySuccess) {
            methodInfoRepository.removeById(methodInfoDO);
        } else if (methodInfoDO.getCurrentRetryTimes() >= methodInfoDO.getRetryTimes()) {
            //LoggerUtil.error(log, "*************** 方法达到最大重试次数, 重试失败, 人工介入! methodInfoDO={} ***************", JSONObject.toJSONString(methodInfoDO));
            methodInfoRepository.removeById(methodInfoDO);
        } else {
            methodInfoDO.setNextRetryTime(DateUtil.addDate(new Date(), TimeUnit.MINUTES, 1));
            methodInfoRepository.updateById(methodInfoDO);
        }
    }

}
