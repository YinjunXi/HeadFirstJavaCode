package com.muhlenxi;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yangxi on 2017/5/26.
 */
public class FileOutDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream outputStream = new FileOutputStream("example/out.dat");
        outputStream.write('A');
        outputStream.write('B');
        int a = 10;
        outputStream.write(a >>> 24);
        outputStream.write(a >>> 16);
        outputStream.write(a >>> 8);
        outputStream.write(a);

        byte[] bytes = "中国".getBytes();
        outputStream.write(bytes);
        outputStream.close();

        IOUtil.printHex("example/out.dat");

    }
}
