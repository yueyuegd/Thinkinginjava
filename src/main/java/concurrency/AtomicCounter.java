package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangyue95
 * @date 2020/1/19.
 * 以AtomicInteger为例看一下，在不用锁的情况下是如何保证线程安全的
 */
public class AtomicCounter {

    private AtomicInteger atomicInteger = new AtomicInteger();

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public void increment() {
        this.atomicInteger.incrementAndGet();
    }

    public void decrement() {
        this.atomicInteger.decrementAndGet();
    }

}
