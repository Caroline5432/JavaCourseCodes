package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Homework04
 * @Description
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * @Author Caroline
 * @Date 2022/3/25 18:08
 **/
public class AysncRun12 {

    public static void main(String[] args) throws Exception {

        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // FutureTask 可获取返回值
        SumThread sumThread = new SumThread();
        FutureTask futureTask = new FutureTask<>(sumThread);
        executorService.submit(futureTask);
        executorService.shutdown();
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+ futureTask.get());
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        System.out.println("Main Thread End!");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2) {
            return 1;
        }
        return fibo(a-1) + fibo(a-2);
    }

    static class SumThread implements Callable {

        @Override
        public Object call() throws Exception {
            return sum();
        }
    }

}
