package com.syaaa.nio;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author syaaa
 * @version 1.0
 * @date 15:56   2018-10-22
 **/
public class TestChannel2 {

    /**
     * @author syaaa
     * @date 16:06 2018-10-22
     * @param
     * @return void
     **/
    @Test
    public void test2(){
        try {

            RandomAccessFile faf = new RandomAccessFile("1.jpg","rw");
            faf.getChannel();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * 通道之间的数据传输（直接缓冲区）
     *
     * transferFrom()
     * transferTo()
     * @author syaaa
     * @date 15:57 2018-10-22
     * @param
     * @return void
     **/
    @Test
    public void test(){
        try {
            FileChannel inChannel = FileChannel.open(Paths.get("F:\\新版xmodel.zip"), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get("F:\\新版xmodel2.zip"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);

//            inChannel.transferTo(0,inChannel.size(), outChannel);

            outChannel.transferFrom(inChannel, 0, inChannel.size());
            outChannel.close();
            inChannel.close();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
