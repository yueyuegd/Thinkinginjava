package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 * 饱汉形式的单例模式变种二：双重检查
 * 变种2在变种1的外层又套了一层check，加上synchronized内层的check，
 * 即所谓“双重检查锁”（Double Check Lock，简称DCL）。
 * 看起来变种2似乎已经达到了理想的效果：懒加载+线程安全。可惜的是，DCL仍然是线程不安全的，
 * 由于指令重排序，你可能会得到“半个对象”，即”部分初始化“问题。
 */
public class Singleton1_2 {

    private static Singleton1_2 instance = null;

    private int f1 = 1;
    private int f2 = 2;//触发部分初始化的问题

    private Singleton1_2() {

    }

    public Singleton1_2 getInstance() {
        if (instance == null) {
            synchronized (Singleton1_2.class) {
                if (instance == null) {
                    instance = new Singleton1_2();
                }
            }
        }
        return instance;
    }
}
