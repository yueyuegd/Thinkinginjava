package Chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue on 2019/5/18.
 */
public class ArrayListEx1 {

    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        Person person = new Person("张三");
        list1.add(person);
        System.out.println("list1.size():" + list1.size());
        System.out.println("list2.size():" + list2.size());
        List<Person> list3 = new ArrayList<>(50);
    }
}
