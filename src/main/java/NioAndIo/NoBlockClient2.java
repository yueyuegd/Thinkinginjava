package NioAndIo;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

/**
 * @author zhangyue95
 * @date 2020/2/27.
 * 演示NIO非阻塞形态：客户端
 * 在客户端上想要获取得到服务器端的数据，也要注册在监听读事件
 */
public class NoBlockClient2 {

    public static void main(String[] args) throws IOException{
        //1.获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 6666));
        //1.1切换成非阻塞模式
        socketChannel.configureBlocking(false);
        //1.2获取选择器
        Selector selector = Selector.open();
        //1.3将通道注册到选择器中，获取(读取)服务器返回的数据
        socketChannel.register(selector, SelectionKey.OP_READ);
        //2.发送一张图片给服务器端
        FileChannel fileChannel = FileChannel.open(
                Paths.get("/Users/zhangyue/MyGithub/ThinkingInJava/src/main/resources/pic/client.JPG")
                , StandardOpenOption.READ);
        //3.要使用NIO，有了Channel，还需要Buffer操作数据
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //4.读取本地文件（图片）发送到服务器
        while (fileChannel.read(byteBuffer) != -1) {
            //在读之前切换成读模式
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            //读完之后切换成写模式，能让其他通道继续读取文件的数据
            byteBuffer.clear();
        }
        //5.轮询的获取选择器上已就绪事件---》只要select()>0说明已就绪
        while (selector.select() > 0) {
            //6.获取当前选择器上所有注册的“选择键”(已就绪的监听事件)
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            //7.获取已就绪事件（不同的事件做不同的事）
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                //8.读事件就绪
                if (selectionKey.isReadable()) {
                    //8.1得到对应的通道
                    SocketChannel socketChannel1 = (SocketChannel) selectionKey.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    //9.知服务器端会返回响应数据给客户端，客户端在这里接收
                    int readBytes = socketChannel1.read(buffer);
                    if (readBytes > 0) {
                        //切换读模式
                        buffer.flip();
                        System.out.println(new String(buffer.array(), 0 , readBytes));
                    }
                }
                //10.取消选择键（已经处理过的事件，就应该取消掉了）
                iterator.remove();
            }
        }

    }
}
