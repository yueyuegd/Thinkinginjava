package CurrentLimiting;

import com.google.common.util.concurrent.RateLimiter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangyue95
 * @date 2019/9/10.
 * guava限流算法基于令牌桶算法
 */
public class CurrentLimitingDemo {

    public static void main(String[] args) {
        /*List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.toString());
        List<String> subList = list.subList(0, list.size() - 2);
        System.out.println(subList.toString());
        subList.set(0, "5");
        System.out.println(list);
        System.out.println(subList);*/
        //线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //速率是每秒只有三个许可
        final RateLimiter rateLimiter = RateLimiter.create(3.0);
        for (int i = 0; i < 100; i++) {
            final int no = i;
            Runnable runnable = () -> {
                try {
                    //获取许可
                    rateLimiter.acquire();
                    System.out.println("Accessing: " + no + ", time: "
                            + new SimpleDateFormat("yy-MM-DD HH:mm:ss").format(new Date()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };
            //执行线程
            executorService.execute(runnable);
        }
        //退出线程
        executorService.shutdown();
    }
}
