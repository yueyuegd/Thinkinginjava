package concurrency;

import java.util.concurrent.locks.StampedLock;

/**
 * @author zhangyue95
 * @date 2019/12/13.
 */
public class TestStampedLock {

    class Point {
        /*private int x,y;
        final StampedLock sl = new StampedLock();
        //计算到原点的距离
        int distanceFromOrigin() {
            //乐观读
            long stamp = sl.tryOptimisticRead();
            //读入局部变量
            //读的过程数据可能被修改
            int curX = x, curY = y;
            //判断执行读操作期间，
            //是否存在写操作，如果存在，
            //则sl.validate(stamp)返回false
            if (!sl.validate(stamp)) {
                //升级为悲观读锁
                stamp = sl.readLock();
                try {
                    curX = x;
                    curY = y;
                } finally {
                    //释放悲观读锁
                    sl.unlockRead(stamp);
                }
            }
            return (int) Math.sqrt(curX * curX + curY * curY);
        }*/
        private double x,y;
        final StampedLock sl = new StampedLock();
        //存在问题的方法
        void moveIfOrigin(double newX, double newY) {
            long stamp = sl.readLock();
            try {
                while (x == 0.0 && y == 0.0) {
                    long ws = sl.tryConvertToWriteLock(stamp);
                    if (ws != 0L) {
                        x = newX;
                        y = newY;
                        stamp = ws;
                        break;
                    } else {
                        sl.unlockRead(stamp);
                        stamp = sl.writeLock();
                    }
                }
            } finally {
                sl.unlock(stamp);
            }
        }

    }


}
