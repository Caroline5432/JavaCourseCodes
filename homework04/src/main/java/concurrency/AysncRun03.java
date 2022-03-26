package concurrency;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName Homework04
 * @Description
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * @Author Caroline
 * @Date 2022/3/25 18:08
 **/
public class AysncRun03 {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        SumThread sumThread = new SumThread();
        sumThread.setMainThread(Thread.currentThread());
        sumThread.start();

        // 利用LockSupport的park/unpark，在启动计算线程之后执行park,在计算线程结束之后调用主线程的unpark
        LockSupport.park();

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

        private Thread mainThread;

        private Integer result;

        public Integer getResult() {
            return result;
        }

        public Thread getMainThread() {
            return mainThread;
        }

        public void setMainThread(Thread mainThread) {
            this.mainThread = mainThread;
        }

        @Override
        public void run() {
            synchronized (lock) {
                result = sum();
                LockSupport.unpark(mainThread);
            }
        }
    }

}
