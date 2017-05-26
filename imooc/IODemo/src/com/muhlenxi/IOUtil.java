package com.muhlenxi;

import java.io.*;

/**
 * Created by yangxi on 2017/5/25.
 */
public class IOUtil {
    /**
     * 读取指定文件内容，以16进制输出到控制台上
     * @param fileName
     */
    public static void printHex(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        int b;
        int i = 1;
        while ((b = inputStream.read()) != -1) {
            if (b <= 0xf) {
                // 单位数前面补0
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(b) + " ");
            if (i++ %10 == 0 ) {
                System.out.println();
            }
        }
        inputStream.close();
    }

    public static void printHexByByteArray(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buff = new byte[20*1024];
        int bytes = inputStream.read(buff,0,buff.length);
        int j = 1;
        for (int i = 0; i < bytes; i++) {
            if (buff[i] <= 0xf) {
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(buff[i]) + " ");

            if (j++ % 10 == 0){
                System.out.println();
            }
        }
        inputStream.close();
    }

    /**
     * 拷贝文件，字节批量读取
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFile(File src, File des) throws IOException {
        if (!src.exists()){
            throw  new IllegalArgumentException("文件:" + src + "不存在");
        }
        if (!src.isFile()) {
            throw new IllegalArgumentException( src + "不存在");
        }

        FileInputStream inputStream = new FileInputStream(src);
        FileOutputStream outputStream = new FileOutputStream(des);

        byte[] buff = new byte[8 * 1024];
        int b;
        while ((b = inputStream.read(buff,0,buff.length)) != -1) {
            outputStream.write(buff,0,b);
        }
        outputStream.flush();

        inputStream.close();
        outputStream.close();
    }

    /**
     * 拷贝文件，利用带缓冲的字节流
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyByBuffer(File src, File des) throws IOException {
        if (!src.exists()) {
            throw new IllegalArgumentException("文件:" + src + "不存在");
        }
        if (!src.isFile()) {
            throw new IllegalArgumentException(src + "不存在");
        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(des));
        int c;
        while ((c = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(c);
        }
        bufferedOutputStream.flush();
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 拷贝文件，单字节
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFileByByte(File src, File des) throws IOException {
        if (!src.exists()) {
            throw new IllegalArgumentException("文件:" + src + "不存在");
        }
        if (!src.isFile()) {
            throw new IllegalArgumentException(src + "不存在");
        }

        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(des);
        int c;
        while ((c = fileInputStream.read()) != -1) {
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();

        fileInputStream.close();
        fileOutputStream.close();
    }
}
