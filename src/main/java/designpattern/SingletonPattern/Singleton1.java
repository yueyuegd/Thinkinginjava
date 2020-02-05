package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 * 单例模式一种写法：基础饱汉模式
 * 饱汉，即已经吃饱，不着急再吃，饿的时候再吃。
 * 所以他就先不初始化单例，等第一次使用的时候再初始化，即“懒加载”。
 * 饱汉模式的核心就是懒加载。好处是更启动速度快、节省资源，
 * 一直到实例被第一次访问，才需要初始化单例；小坏处是写起来麻烦，
 * 大坏处是线程不安全，if语句存在竞态条件。
 * 写起来麻烦不是大问题，可读性好啊。
 * 但多线程环境下，基础饱汉就彻底不可用了。
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1() {

    }

    public Singleton1 getInstance() {
        if (instance == null) {
            instance =  new Singleton1();
        }
        return instance;
    }
}
