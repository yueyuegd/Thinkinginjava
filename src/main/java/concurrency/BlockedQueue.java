package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangyue95
 * @date 2019/11/9.
 */
public class BlockedQueue<T> {

    final Lock lock = new ReentrantLock();
    //条件变量：队列不满
    final Condition notFull = lock.newCondition();
    //条件变量：队列不空
    final Condition notEmpty = lock.newCondition();
    //入队
    void enq(T x) {
        lock.lock();
        /*try {
            while (*//*队列已满*//*) {
                notFull.await();
            }
        }*/
    }
}
