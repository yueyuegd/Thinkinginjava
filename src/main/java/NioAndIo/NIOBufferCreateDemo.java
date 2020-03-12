package NioAndIo;


import java.nio.ByteBuffer;

/**
 * @author zhangyue95
 * @date 2020/2/26.
 * 演示如何创建缓冲区，核心变量的值是如何是怎么变化的
 */
public class NIOBufferCreateDemo {

    public static void main(String[] args) {
        //创建一个缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //看一下初始时四个核心变量的值
        System.out.println("初始时-》》》limit《《《-" + byteBuffer.limit());
        System.out.println("初始时-》》》position《《《-" + byteBuffer.position());
        System.out.println("初始时-》》》capacity《《《-" + byteBuffer.capacity());
        System.out.println("初始时-》》》mark《《《-" + byteBuffer.mark());
        System.out.println("--------------------------------------");
        //添加一些数据到缓冲区
        String string = "zhangyue";
        byteBuffer.put(string.getBytes());
        //看一下当前四个核心变量的值
        System.out.println("put完之后-》》》limit《《《-" + byteBuffer.limit());
        System.out.println("put完之后-》》》position《《《-" + byteBuffer.position());
        System.out.println("put完之后-》》》capacity《《《-" + byteBuffer.capacity());
        System.out.println("put完之后-》》》mark《《《-" + byteBuffer.mark());
        System.out.println("--------------------------------------");
        //从缓冲区拿取数据:切换成读模式，此时position是指要读的位置，limit指的是限制可以读取的位置
        byteBuffer.flip();
        //看一下当前四个核心变量的值
        System.out.println("flip完之后-》》》limit《《《-" + byteBuffer.limit());
        System.out.println("flip完之后-》》》position《《《-" + byteBuffer.position());
        System.out.println("flip完之后-》》》capacity《《《-" + byteBuffer.capacity());
        System.out.println("flip完之后-》》》mark《《《-" + byteBuffer.mark());
        System.out.println("--------------------------------------");
        //开始读取数据
        //创建一个limit大小的数组用于读取数据(以为此时只可以读取limit这么多数据)
        byte[] bytes = new byte[byteBuffer.limit()];
        //将缓冲区的数据读取到数组中
        byteBuffer.get(bytes);
        //输出数据
        System.out.println(new String(bytes, 0, bytes.length));
        System.out.println("--------------------------------------");
        //读完之后还要写数据，使用clear()函数，这个函数会“清空”缓冲区，数据并没有被真正的清除，只是被遗忘了
        byteBuffer.clear();
        //看一下当前四个核心变量的值
        System.out.println("clear完之后-》》》limit《《《-" + byteBuffer.limit());
        System.out.println("clear完之后-》》》position《《《-" + byteBuffer.position());
        System.out.println("clear完之后-》》》capacity《《《-" + byteBuffer.capacity());
        System.out.println("clear完之后-》》》mark《《《-" + byteBuffer.mark());

    }
}
