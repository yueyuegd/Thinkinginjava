package concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangyue95
 * @date 2020/1/13.
 */
public class MyFairLock extends Thread {

    private ReentrantLock lock = new ReentrantLock(false);
    public void fairLock() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "正在持有锁");
        }finally {
            System.out.println(Thread.currentThread().getName() + "释放了锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyFairLock myFairLock = new MyFairLock();
        myFairLock.fairLock();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "启动");
            myFairLock.fairLock();
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
