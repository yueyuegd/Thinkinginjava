package Chapter5;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangyue95
 * @date 2019/6/19.
 */
public class SetExer {

    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("张三");
        strSet.add("李四");
        strSet.add("王五");
        strSet.add("赵六");

        System.out.println("strSet:" + strSet);
        System.out.println("strSet.size():" + strSet.size());
        System.out.println("strSet里是否为空：" + strSet.isEmpty());

        System.out.println("删除王五：");
        boolean delFlag = strSet.remove("王五");
        System.out.println("删除王五是否成功：" + delFlag);
        System.out.println("删除王五后的strSet：" + strSet);
        System.out.println("strSet中是否包含王五：" + strSet.contains("王五"));
        System.out.println("strSet中是否包含张三：" + strSet.contains("张三"));

        System.out.println("clear清除元素：");
        strSet.clear();
        System.out.println("strSet的长度：" + strSet.size());
        System.out.println("strSet是否为空：" + strSet.isEmpty());
    }
}
