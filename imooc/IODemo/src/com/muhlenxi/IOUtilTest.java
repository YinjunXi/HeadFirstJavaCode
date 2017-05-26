package com.muhlenxi;

import java.io.File;
import java.io.IOException;

/**
 * Created by yangxi on 2017/5/25.
 */
public class IOUtilTest {
    public static void main(String[] args){
        /*
        try {
            IOUtil.printHex("/Users/yangxi/Desktop/imooc/HelloWorld.java");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            IOUtil.printHexByByteArray("/Users/yangxi/Desktop/imooc/HelloWorld.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        File src = new File("/Users/yangxi/Desktop/imooc/HelloWorld.java");
        File des = new File("example/copybuffer.dat");
        try {
            IOUtil.copyByBuffer(src,des);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            IOUtil.printHex(des.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        */

        File src = new File("/Users/yangxi/Desktop/西海情歌.mp3");// 13.9MB
        File des = new File("/Users/yangxi/Desktop/西海情歌1.mp3");
        long start = System.currentTimeMillis();
        try {
            // 36159 ms
            // IOUtil.copyFileByByte(src,des);
            des = new File("/Users/yangxi/Desktop/西海情歌3.mp3");
            // 1541 ms
            // IOUtil.copyByBuffer(src,des);

            // 121 ms
            IOUtil.copyFile(src,des);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
