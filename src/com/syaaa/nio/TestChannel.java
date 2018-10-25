package com.syaaa.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 一、通道（Channel）：用于源节点和目标节点的连接。在JavaNIO中负责缓冲区中的数据传输。
 * Channel本身不存储数据，因此需要配合缓冲区使用进行数据传输。
 * <p>
 * 二、通道的主要实现类：
 * java.nio.channels.Channel接口：
 * |--FileChannel
 * |--SocketChannel
 * |--ServerSocketChannel
 * |--DategramChannel
 * 三、获取通道
 * 1、java针对支持通道的类提供了getChannel()方法
 * 本地IO：
 * FileInputStream/FileOutputStream
 * RandomAccessFile
 * <p>
 * 网络IO
 * Socket
 * ServerSocket
 * DatagramSocket
 * 2、在JDK1.7中的NIO2针对各个通道提供了静态方法open()
 * 3、在JDK1.7中NIO2的Files工具类的newByteChannel()方法获取通道
 * 四、通道之间的数据传输
 * transferFrom()
 * transferTo()
 *
 * 五、分散(scatter)与聚集（Gather）
 * 分散读取（Scatter Read）：将通道中的数据分散到多个缓冲区中，
 * 聚集写入（Gather Write）：将多个缓冲区中的数据聚集到通道中。
 *
 *
 *六、字符集CharSet
 *
 * 编码：字符串-->字节数组
 *
 * 解码：字节数组-->字符串
 *
 *
 *
 *
 *
 *
 * @author syaaa
 * @version 1.0
 * @date 19:30   2018-10-16
 **/
public class TestChannel {
    /*1、利用通道完成文件的复制（非直接缓冲区）*/

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        /*获取通道*/
        FileChannel fisChannel = null;
        FileChannel fosChannel = null;
        try {
            fis = new FileInputStream("1.jpg");
            fos = new FileOutputStream("2.jpg");

            fisChannel = fis.getChannel();
            fosChannel = fos.getChannel();


            /*分配指定大小的缓冲区*/
            ByteBuffer allocate = ByteBuffer.allocate(1024);

            /*将通道中的数据写入缓冲区中 fisChannel.read(allocate)*/
            while (fisChannel.read(allocate) != -1) {

                allocate.flip();//切换读取数据的模式

                //④将缓冲区中的数据写入通道中
                fosChannel.write(allocate);
                /*清空缓冲区*/
                allocate.clear();
            }
        } catch (FileNotFoundException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw, true));
            String str = sw.toString();
            System.out.println("异常信息为：" + str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fosChannel != null) {
                    fosChannel.close();
                }
                if (fisChannel != null) {
                    fisChannel.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
}
