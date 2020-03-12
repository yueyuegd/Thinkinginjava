package NioAndIo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author zhangyue95
 * @date 2020/2/27.
 * 演示NIO非阻塞形态：客户端
 */
public class NoBlockClient {

    public static void main(String[] args) throws IOException{
        //1.获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 6666));
        //1.1切换成非阻塞模式
        socketChannel.configureBlocking(false);
        //2.发送一张图片给服务器
        FileChannel fileChannel = FileChannel.open(Paths.get(""), StandardOpenOption.READ);
        //3.要使用NIO，现在有了Channel，还需要Buffer操作数据
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //4.读取本地文件（图片），发送到服务器
        while (fileChannel.read(byteBuffer) != -1) {
            //在读之前切换成读模式
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            //读完切换成写模式，能让管道继续读取文件的数据
            byteBuffer.clear();
        }
        //5.关闭流
        fileChannel.close();
        socketChannel.close();
    }
}
