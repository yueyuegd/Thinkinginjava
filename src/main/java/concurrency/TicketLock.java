package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangyue95
 * @date 2020/1/19.
 * 简单的TicketLock实现方案，票据排队实现方案
 */
public class TicketLock {
    //队列票据(当前排队号码)
    private AtomicInteger queueNum = new AtomicInteger();
    //出队票据(当前需等待号码)
    private AtomicInteger dueueNum = new AtomicInteger();

    //获取锁，如果获取成功，返回当前线程的排队号
    public int lock() {
        int currentTicketNum = dueueNum.incrementAndGet();
        while (currentTicketNum != queueNum.get()) {
            //do something
        }
        return currentTicketNum;
    }

    //释放锁，传入当前排队的号码
    public void unLock(int ticketNum) {
        queueNum.compareAndSet(ticketNum, ticketNum + 1);
    }
}
