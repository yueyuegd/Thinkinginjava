package concurrency;

/**
 * 测试类：用于测试ThreadLocal能达到在每个线程中创建变量副本
 */
public class ThreadLocalTest {

    ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();


    public void set() {
        longThreadLocal.set(Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longThreadLocal.get();
    }

    public String getString() {
        return stringThreadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
        Thread thread = new Thread(() -> {
            test.set();
            System.out.println(test.getLong());
            System.out.println(test.getString());
        });
        thread.start();
        thread.join();
        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}
