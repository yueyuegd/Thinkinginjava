package designpattern.SingletonPattern;

/**
 * @author zhangyue95
 * @date 2020/2/5.
 */
public enum Singleton4_1 {

    SINGLETON ("enum is the easiest singleton pattern, but not the most readable"){
        @Override
        public void testAbsMethod() {
            System.out.println("enum is ugly, but so flexible to make lots of trick");
        }
    };

    private String comment = null;

    private Singleton4_1(String comment) {
        this.comment = comment;
    }

    public void print() {
        System.out.println("comment=" + comment);
    }

    public abstract void testAbsMethod();

    public static Singleton4_1 getInstance() {
        return SINGLETON;
    }
}
