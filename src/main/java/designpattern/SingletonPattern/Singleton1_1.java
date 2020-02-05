package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 * 饱汉形式的单例模式的变种一：使用synchronized关键字修饰getInstance()方法，这样能达到绝对的线程安全。
 * 好处是写起来简单，且绝对线程安全；坏处是并发性能极差，事实上完全退化到了串行。
 * 单例只需要初始化一次，但就算初始化以后，synchronized的锁也无法避开，
 * 从而getInstance()完全变成了串行操作。性能不敏感的场景建议使用。
 */
public class Singleton1_1 {

    private static Singleton1_1 instance = null;

    private Singleton1_1() {

    }

    public static synchronized Singleton1_1 getInstance() {
        if (instance == null) {
            instance = new Singleton1_1();
        }
        return instance;
    }
}
