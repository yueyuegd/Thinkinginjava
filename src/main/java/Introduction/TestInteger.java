package Introduction;

/**
 * Created by zhangyue on 2019/5/12.
 */
public class TestInteger {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);
        Integer i3 = Integer.valueOf(1000);
        Integer i4 = Integer.valueOf(1000);
        System.out.println(i3 == i4);
        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        System.out.println(i5 == i6);
    }
}
