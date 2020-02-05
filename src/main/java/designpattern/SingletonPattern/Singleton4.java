package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 * 枚举类型的单例模式：用枚举实现单例模式，相当好用，但可读性是不存在的。
 * 基础的枚举形式：将枚举的静态成员变量作为单例的实例.
 * Java的枚举是一个“丑陋但好用的语法糖”。
 * 通过反编译得出枚举类型的本质：
 *
// 枚举
// ThreadSafe
public class Singleton4 extends Enum<Singleton4> {
...
public static final Singleton4 SINGLETON = new Singleton4();
...
}
 */
public enum Singleton4 {
    SINGLETON;
}
