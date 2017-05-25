package com.muhlenxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
}
