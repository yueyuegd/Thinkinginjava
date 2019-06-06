package DataStructure.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangyue on 2019/5/12.
 */
public class LinkedListRemove {

    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        people.add(new Person("张三", 21));
        people.add(new Person("李四", 19));
        people.add(new Person("王五", 25));
        people.add(new Person("赵六", 24));
        System.out.println("删除前的people.size():" + people.size());
        boolean delStatus = people.remove(new Person("王五", 25));
        System.out.println("打印删除状态：" + delStatus);
        System.out.println("删除后的people.size():" + people.size());
    }
}
