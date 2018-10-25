package com.syaaa.nio;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 一、缓冲区（buffer）：在java NIO中负责数据的存取，缓冲区就是数组，用于存储不同数据类型的数据
 *
 * 根据类型数据类型的不同（Boolean除外），提供了相应的类型的缓冲区
 *
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 * 上述缓冲区的管理方式几乎的是一样的，通过allocate()获取缓冲区
 *
 *
 * 二、缓冲区存取数据的两个核心方法
 * put():存储数据到缓冲区
 * get():取得缓冲区的数据
 *
 *
 * 三、缓冲区中的四个核心属性
 *
 *capacity : 容量，表示缓冲区中最大存储数据的容量。一旦声明不能改变。
 * limit : 界限，表示缓冲区中可以操作数据的大小。（limit 后数据不能进行读写）
 * position : 位置，表示缓冲区中正在操作数据的位置。
 *
 * mark : 标记，表示记录当前 position 的位置。可以通过 reset() 恢复到 mark 的位置
 *
 * 0 <= mark <= position <= limit <= capacity
 *
 *
 *四、直接缓冲区与非直接缓冲区：
 *    非直接缓冲区：通过allocate()方法分配缓冲区，将缓冲区建立在JVM中
 *
 *    直接缓冲区： 通过allocateDirect()方法分配缓冲区，将缓冲区建立在物理内存中，可以提高效率
 *
 *
 *
 *
 *
 *
 * @author syaaa
 * @version 1.0
 * @date 12:33   2018-10-16
 **/
public class TestBuffer2 {
   public static void main(String[] args) {
      String str = "abcde";
      ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
      byteBuffer.put(str.getBytes());
      byteBuffer.flip();
      byte[] dst = new byte[byteBuffer.limit()];
      byteBuffer.get(dst,0,2);
      System.out.println(new String(dst,0,2));

      System.out.println(byteBuffer.position());

      //mark():标记
      byteBuffer.mark();

      byteBuffer.get(dst, 2, 2);
      System.out.println(new String(dst, 2, 2));
      System.out.println(byteBuffer.position());

      //reset() : 恢复到 mark 的位置
      byteBuffer.reset();
      System.out.println(byteBuffer.position());
      //判断缓冲区中是否还有剩余数据
      if(byteBuffer.hasRemaining()){

         //获取缓冲区中可以操作的数量
         System.out.println(byteBuffer.remaining());
      }
   }
}
