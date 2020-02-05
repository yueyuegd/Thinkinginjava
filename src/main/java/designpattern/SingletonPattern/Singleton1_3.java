package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 * 饱汉形式的单例模式变种三：针对变种二做出修改：在instance上增加了volatile关键字
 * 多线程环境下，变种3更适用于性能敏感的场景。
 */
public class Singleton1_3 {

    private static volatile Singleton1_3 instance = null;

    public int f1 = 1;
    public int f2 = 2;

    private Singleton1_3() {

    }

    public Singleton1_3 getInstance() {
        if (instance == null) {
            synchronized (Singleton1_3.class) {
                if (instance == null) {
                    instance = new Singleton1_3();
                }
            }
        }
        return instance;
    }
}
