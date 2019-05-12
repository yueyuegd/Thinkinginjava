package Chapter5;

import java.util.*;

/**
 * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对 HashMap 的排序功能，
 * 该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>， 要求对 HashMap 中的 User 的 age 倒序进行排序。
 * 排序时 key=value 键值对不得拆散。
 * 注意 ：要做出这道题必须对集合的体系结构非常的熟悉。 HashMap 本身就是不可排序的， 但是该道题偏偏让给 HashMap 排序，
 * 那我们就得想在 API 中有没有这样的 Map 结构是有序的，LinkedHashMap，对的，就是他，他是 Map 结构，也是链表结构，
 * 有序的，更可喜的是他是 HashMap 的子类，
 * 我们返回 LinkedHashMap<Integer,User>即可，还符合面向接口（父类编程的思想）。
 * 但凡是对集合的操作，我们应该保持一个原则就是能用 JDK 中的 API 就有 JDK 中的 API，
 * 比如排序算法我们不应该去用冒泡或者选择，而是首先想到用 Collections 集合工具类。
 * Created by zhangyue on 2019/5/9.
 */
public class HashmapEX {

    public static void main(String[] args) {
        HashMap<Integer, User> userMap = new LinkedHashMap<Integer, User>();
        Random random = new Random();
        for (int i = 0; i<= 10; i++) {
            int next = random.nextInt(100);
            userMap.put(i, new User("test" + next, next));
        }
        System.out.println("before:" + userMap);
        System.out.println("after:" + reversedSort(userMap));

    }

    private static Map<Integer, User> reversedSort(Map<Integer, User> map) {
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, User> sortHashMap = new LinkedHashMap<Integer, User>();
        for (Map.Entry<Integer, User> temp : list) {
            sortHashMap.put(temp.getKey(), temp.getValue());
        }
        return sortHashMap;
    }
}
