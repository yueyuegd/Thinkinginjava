package NioAndIo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhangyue95
 * @date 2020/2/25.
 * 测试一下使用NIO复制文件和传统IO复制文件的性能
 */
public class SimpleFileTransferTest {

    private long transferFile(File source, File des) throws IOException {
        long startTime = System.currentTimeMillis();
        if (!des.exists()) {
            des.createNewFile();
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
        //将数据源读到的内容写入到目的地--使用数组
        byte[] bytes = new byte[1024 * 1024];
        int len;
        while((len = bis.read()) != -1) {
            bos.write(bytes, 0, len);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private long transferFileWithNIO(File source, File des) throws IOException {
        long startTime = System.currentTimeMillis();
        RandomAccessFile read = new RandomAccessFile(source, "rw");
        RandomAccessFile write = new RandomAccessFile(des, "rw");
        FileChannel readChannel = read.getChannel();
        FileChannel writeChannle = write.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 1024);
        while (readChannel.read(byteBuffer) > 0) {
            byteBuffer.flip();
            writeChannle.write(byteBuffer);
            byteBuffer.clear();
        }
        writeChannle.close();
        readChannel.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) throws IOException{
        SimpleFileTransferTest simpleFileTransferTest = new SimpleFileTransferTest();
        File source = new File("/Users/zhangyue/MyGithub/ThinkingInJava/src/main/resources/file/[2015 MBC Music festival]  BTS - Perfect Man(Original by, SHINHWA), 방탄소년단 - Perfect Man 20151231.mp4");
        File des = new File("/Users/zhangyue/MyGithub/ThinkingInJava/src/main/resources/file/20151231.mp4");
        File nio = new File("/Users/zhangyue/MyGithub/ThinkingInJava/src/main/resources/file/20151231nio.mp4");
        long time = simpleFileTransferTest.transferFile(source, des);
        System.out.println("普通字节流时间：" + time);
        long NioTime = simpleFileTransferTest.transferFileWithNIO(source, nio);
        System.out.println("NIO时间：" + NioTime);
    }
}
