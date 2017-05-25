package com.muhlenxi;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by yangxi on 2017/5/25.
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("example");
        if (!file.exists()) {
            file.mkdir();
        }
        File file1 = new File(file,"raf.dat");
        if (!file1.exists()) {
            file1.createNewFile();
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(file1,"rw");
        //指针位置
        System.out.println(randomAccessFile.getFilePointer());

        // 写一个字节
        randomAccessFile.write('A');
        randomAccessFile.write('B');
        System.out.println(randomAccessFile.getFilePointer());

        // 写一个 int
        int i = 0xfefefefe;
        randomAccessFile.writeInt(i);
        System.out.println(randomAccessFile.getFilePointer());

        String s = "中";
        byte[] bytes = s.getBytes();
        randomAccessFile.write(bytes);

        // 读文件
        randomAccessFile.seek(0);
        byte[] bytes1 = new byte[(int) randomAccessFile.length()];
        randomAccessFile.read(bytes1);
        System.out.println(Arrays.toString(bytes1));

        String s1 = new String(bytes1);
        System.out.println(s1);

        randomAccessFile.close();

    }
}
