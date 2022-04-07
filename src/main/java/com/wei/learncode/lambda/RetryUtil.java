package com.wei.learncode.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2022年02月22日 14:25
 * @since 1.0
 */
@Slf4j
public class RetryUtil {

    public static <T> void retry(int maxCount, int sleepTime, NewSupplier supplier)
            throws Exception {

        for (int i = 0; i <= maxCount; i++) {
            try {
                log.info("方法第" + (i + 1) + "次执行");
                supplier.get();
            } catch (Exception e) {
                if (i == maxCount) {
                    log.error("方法超过最大重试次数，仍然报错:" + e);
                    throw e;
                }
                log.info("等待" + sleepTime + "毫秒");
                Thread.sleep(sleepTime);
                continue;
            }
            break;
        }

    }

    public static void main(String[] args) {
        try {
            RetryUtil.retry(1, 5000,
                    // 调用服务
                    () -> {
                        System.out.println(1/0);
                        System.out.println(1);
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
