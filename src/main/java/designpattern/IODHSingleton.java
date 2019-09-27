package designpattern;

/**
 * 懒加载：单例模式的实现
 */
public class IODHSingleton {
    static Long id = 1L;
    static class SingletonHolder {
        static IODHSingleton instance = new IODHSingleton();
    }

    public static IODHSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
