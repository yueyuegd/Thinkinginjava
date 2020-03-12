package NioAndIo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

/**
 * @author zhangyue95
 * @date 2020/2/27.
 * 演示NIO非阻塞形态：服务端
 */
public class NoBlockServer {

    public static void main(String[] args) throws IOException{
        //1.获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //2.切换成非阻塞模式
        serverSocketChannel.configureBlocking(false);
        //3.绑定链接
        serverSocketChannel.bind(new InetSocketAddress(6666));
        //4.获取选择器
        Selector selector = Selector.open();
        //4.1将通道注册到选择器上，指定接收“监听通道”事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        //5.轮询地获取选择器上已经“就绪”的事件----》只要select()>0，说明已就绪
        while (selector.select() > 0) {
            //6.获取当前选择器所有注册的“选择键”（已就绪的监听事件）
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            //7.获取已就绪的事件（不同的事件做不同的事）
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                //接收事件就绪
                if (selectionKey.isAcceptable()) {
                    //8.获取客户端的链接
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    //8.1切换成非阻塞模式
                    socketChannel.configureBlocking(false);
                    //8.2注册到选择器上---》拿到客户端的连接为了读取通道的数据（监听读就绪事件）
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    //读事件就绪
                    //9.获取当前选择器读就绪状态的通道
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    //9.1读取数据
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    //9.2得到文件通道，将客户端传递过来的图片写到本地项目下（写模式，没有则创建）
                    FileChannel fileChannel = FileChannel.open(
                            Paths.get("/Users/zhangyue/MyGithub/ThinkingInJava/src/main/resources/pic/client2.JPG"),
                            StandardOpenOption.WRITE, StandardOpenOption.CREATE);
                    while (socketChannel.read(byteBuffer) > 0) {
                        //在读模式之前切换成读模式
                        byteBuffer.flip();
                        fileChannel.write(byteBuffer);
                        //读完之后切换成写模式，能让管道继续读取文件的数据
                        byteBuffer.clear();
                    }
                    //此时服务器端保存了图片之后，想要告诉客户端，图片已经上传好了
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    buffer.put("the img is received, thank you client, I am zhangyue".getBytes());
                    buffer.flip();
                    socketChannel.write(buffer);
                }
                //10.取消选择键（已经处理过的事件，就应该取消）
                iterator.remove();
            }
        }
    }
}
