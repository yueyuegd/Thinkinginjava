package Chapter5;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zhangyue on 2019/5/9.
 */
public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int next = random.nextInt(100);
            list.add(String.valueOf(next));
        }
        list.add(String.valueOf(random.nextInt(100)));
        list.trimToSize();
    }
}
