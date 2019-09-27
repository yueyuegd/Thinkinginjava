package designpattern;

public class JMMSingleton {
    private static volatile JMMSingleton instance;
    private static int a;
    private static int b;
    private static int c;
    public static JMMSingleton getInstance() {
        if (instance == null) {
            synchronized (JMMSingleton.class) {
                if (instance == null) {
                    a = 1;
                    b = 2;
                    instance = new JMMSingleton();
                    c = a + b;
                }
            }
        }
        return instance;
    }


}
