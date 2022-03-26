package concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Homework04
 * @Description
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * @Author Caroline
 * @Date 2022/3/25 18:08
 **/
public class AysncRun06 {

    private static final ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) throws InterruptedException {

        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        SumThread sumThread = new SumThread();
        sumThread.start();

        // 让计算线程先拿到可重入锁ReentrantLock，之后main方法被阻塞，直到计算线程结束为止
        TimeUnit.MILLISECONDS.sleep(1);
        lock.lock();
        try {
            System.out.println("--------------");
        } finally {
            lock.unlock();
        }

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
            lock.lock();
            try {
                result = sum();
            } finally {
                lock.unlock();
            }
        }
    }

}
