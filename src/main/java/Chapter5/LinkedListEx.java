package Chapter5;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangyue
 * @date 2019/5/22.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("张三", 21));
        list.add(new Person("李四", 19));
        list.add(new Person("王五", 25));
        list.add(new Person("赵六", 24));
        System.out.println(list.size());
        System.out.println("删除前的list.size():" + list.size());
        boolean delState = list.remove(new Person("王五", 25));
        System.out.println("删除的状态：" + delState);
        System.out.println("删除后的list.size():" + list.size());
    }
}
