package com.wei.learncode.geektime.five;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @Author: skye
 * @Date: 2019/11/7 14:28
 * @Description:
 * @Version:1.0
 */
public class ForkJoin {

    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool(4);
        Fibonacci fib =
                new Fibonacci(3);
        // 启动分治任务
        Integer result =
                fjp.invoke(fib);
        // 输出结果
        System.out.println(result);
    }
    // 递归任务
    static class Fibonacci extends
            RecursiveTask<Integer> {
        final int n;

        Fibonacci(int n) {
            this.n = n;
        }

        protected Integer compute() {
            if (n <= 1)
                return n;
            Fibonacci f1 =
                    new Fibonacci(n - 1);
            // 创建子任务
            f1.fork();
            Fibonacci f2 =
                    new Fibonacci(n - 2);
            // 等待子任务结果，并合并结果
            return f2.compute() + f1.join();
        }
    }
}
