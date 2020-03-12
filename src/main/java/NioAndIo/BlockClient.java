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
 * 用于演示NIO在网络中是阻塞的状态代码：客户端
 */
public class BlockClient {

    public static void main(String[] args) throws IOException{
        //1.获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 6666));
        //2.发一张图片给服务器端
        FileChannel fileChannel = FileChannel.open(Paths.get(""), StandardOpenOption.READ);
        //3.要使用NIO，有了Channel，就必然有Buffer，Buffer是与数据打交道的。
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //4.读取本地文件（图片），发送到服务器
        while (fileChannel.read(byteBuffer) != -1) {
            //在读之前切换成读模式
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            //读完切换成写模式，能让管道继续读取文件的数据
            byteBuffer.clear();
        }
        //告诉服务器端写完了
        socketChannel.shutdownOutput();
        //客户端接收服务端带过来的数据
        //知道服务器端要返回响应数据给客户端，客户端在这里接收
        int len = 0;
        while ((len = socketChannel.read(byteBuffer)) != -1) {
            //切换读模式
            byteBuffer.flip();
            System.out.println(new String(byteBuffer.array(), 0, len));
            //切换写模式
            byteBuffer.clear();
        }
        //5.关闭流
        fileChannel.close();
        socketChannel.close();

    }
}
