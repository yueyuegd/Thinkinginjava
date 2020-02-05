package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author zhangyue95
 * @date 2020/1/19.
 * 简单的自旋锁
 */
public class SpinLockTest {

    private AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    public void lock() {
        //循环检测尝试获取锁
        while(!tryLock()) {
            //do something
        }
    }

    public boolean tryLock() {
        //尝试获取锁，成功返回true，失败返回false
        return atomicBoolean.compareAndSet(false, true);
    }

    public void unLock() {
        if (!atomicBoolean.compareAndSet(true, false)) {
            throw new RuntimeException("释放锁失败");
        }
    }
}
