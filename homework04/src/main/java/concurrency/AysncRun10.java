package concurrency;

import java.util.concurrent.Semaphore;

/**
 * @ClassName Homework04
 * @Description
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * @Author Caroline
 * @Date 2022/3/25 18:08
 **/
public class AysncRun10 {

    private static final Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) throws Exception {

        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        SumThread sumThread = new SumThread();
        sumThread.start();

        // Semaphore初始为0，在主线程中执行acquire，自然会被阻塞，等到计算线程执行完毕，执行release
        semaphore.acquire();

        int result = sumThread.getResult();
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
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

    static class SumThread extends Thread {

        private Integer result;

        public Integer getResult() {
            return result;
        }

        @Override
        public void run() {
            result = sum();
            semaphore.release();
        }
    }

}
