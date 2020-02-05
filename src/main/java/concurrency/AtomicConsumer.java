package concurrency;

/**
 * @author zhangyue95
 * @date 2020/1/19.
 */
public class AtomicConsumer extends Thread {

    private AtomicCounter counter;

    public AtomicConsumer(AtomicCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int j = 0; j < AtomicTest.LOOP; j++) {
            System.out.println("consumer: " + counter.getAtomicInteger());
            counter.decrement();
        }
    }
}
