package concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyue95
 * @date 2019/10/10.
 * Allocator：用于申请和释放资源的角色
 */
public class Allocator {

    private List<Object> als = new ArrayList<>();
    //一次性申请所有的资源
    synchronized boolean apply(Object from, Object to) {
        if (als.contains(from) || als.contains(to)) {
            return false;
        } else {
            als.add(from);
            als.add(to);
        }
        return true;
    }

    //归还资源
    synchronized void free(Object from, Object to) {
        als.remove(from);
        als.remove(to);
    }
}
