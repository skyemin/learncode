package com.wei.learncode.stopwatch;

import org.springframework.util.StopWatch;

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
 * @date Created in 2021年11月17日 11:39
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();

        // 任务一模拟休眠3秒钟
        stopWatch.start("TaskOneName");
        Thread.sleep(1000 * 3);
        //System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        // 任务一模拟休眠10秒钟
        stopWatch.start("TaskTwoName");
        Thread.sleep(1000 * 5);
        //System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        // 任务一模拟休眠10秒钟
        stopWatch.start("TaskThreeName");
        Thread.sleep(1000 * 2);
        //System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        // 打印出耗时
        System.out.println(stopWatch.prettyPrint());
        // 任务总的耗时  如果你想获取到每个任务详情（包括它的任务名、耗时等等）可使用
        //System.out.println("所有任务总耗时：" + stopWatch.getTotalTimeMillis());
    }
}
