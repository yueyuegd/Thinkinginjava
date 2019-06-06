package Chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyue
 * @date 2019/5/22.
 */
public class ArrayListEx2 {

    public static void main(String[] args) {
        List<Person> perList = new ArrayList<>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));
        perList.add(new Person("孙七", 32));
        perList.add(new Person("周八", 17));
        perList.add(new Person("钱九", 24));
        perList.add(new Person("吴十", 23));
        perList.add(new Person("冯十一", 18));
        perList.add(new Person("朱十二", 36));
        perList.remove(5);
        perList.remove(new Person("孙七", 32));
        perList.add(2, new Person("李莫愁", 29));
        System.out.println("perList.size():" + perList.size());
    }
}
