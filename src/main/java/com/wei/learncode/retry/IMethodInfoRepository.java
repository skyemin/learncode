package com.wei.learncode.retry;

import java.util.Date;
import java.util.List;

public interface IMethodInfoRepository {
    List<MethodInfoDO> getListByStatusAndDate(RetryStatusEnum retryStatusEnum, Date currentDate, String hostAddress);

    void save(MethodInfoDO ret);

    void removeById(MethodInfoDO methodInfoDO);

    void updateById(MethodInfoDO methodInfoDO);
}
