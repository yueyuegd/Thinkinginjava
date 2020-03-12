package NioAndIo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author zhangyue95
 * @date 2020/2/27.
 * 用于演示NIO在网络中是阻塞的状态代码：服务器端
 */
public class BlockServer {

    public static void main(String[] args) throws IOException{
        //1.获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //2.得到文件通道，将客户端传递过来的图片写到本地项目下（写模式，没有则创建）
        FileChannel fileChannel = FileChannel.open(Paths.get(""), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //3.绑定链接
        serverSocketChannel.bind(new InetSocketAddress(6666));
        //4.获取客户端的图片（阻塞的）
        SocketChannel socketChannel = serverSocketChannel.accept();
        //5.要使用NIO，有了Channel，就必然有Buffer，Buffer是与数据打交道的
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //6.将客户端传递过来的图片保存到本地
        while (socketChannel.read(byteBuffer) != -1) {
            //切换成读模式
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
            //读完切换成写模式，能让其他管道继续读取文件的数据
            byteBuffer.clear();
        }
        //此时服务器端保存完图片之后，告诉客户端，图片上传成功
        byteBuffer.put("img is success".getBytes());
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
        byteBuffer.clear();
        //7.关闭通道
        fileChannel.close();
        serverSocketChannel.close();
        socketChannel.close();
    }
}
