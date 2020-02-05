package jvm;

/**
 * @author zhangyue95
 * @date 2020/2/4.
 * 乱序优化在单核时代不影响正确性；
 * 但多核时代的多线程能够在不同的核上实现真正的并行，一旦线程间共享数据，就出现问题了.
 * 以下为一段经典代码。
 */
public class OutofOrderExecution {
    private static int x = 0, y = 0;
    private static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            a = 1;
            x = b;
        });

        Thread t2 = new Thread(() -> {
            b = 1;
            y = a;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("(" + x + "," + y + ")");
    }
}
