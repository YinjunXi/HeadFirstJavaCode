package com.muhlenxi;

import java.io.*;

/**
 * Created by yangxi on 2017/5/26.
 */
public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException{
        String file = "example/dos.dat";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

        dos.writeInt(10);
        dos.writeInt(-10);
        dos.writeLong(10);
        dos.writeDouble(10.5);

        dos.writeUTF("中国人");
        //dos.writeChars("中国");

        dos.close();
        IOUtil.printHex(file);

        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        int i = dis.readInt();
        int j = dis.readInt();

        long l = dis.readLong();
        double d = dis.readDouble();

        String s = dis.readUTF();
        dis.close();

        System.out.println(s);


    }
}
