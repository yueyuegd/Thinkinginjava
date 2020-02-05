package concurrency;

/**
 * @author zhangyue95
 * @date 2020/1/19.
 */
public class AtomicTest {

    final static int LOOP = 10000;

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();
        AtomicProducer producer = new AtomicProducer(counter);
        AtomicConsumer consumer = new AtomicConsumer(counter);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println(counter.getAtomicInteger());
    }
}
