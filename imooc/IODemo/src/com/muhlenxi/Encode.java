package com.muhlenxi;

/**
 * Created by yangxi on 2017/5/24.
 */
public class Encode {
    public static void main(String[] args) throws Exception{
        String s = "慕课ABC";
        byte[] bytes = s.getBytes();
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes1 = s.getBytes("utf-16be");
        for(byte b : bytes1) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        // gdk 编码中中文占用2个字节，英文占用1个字节
        // utf-8 编码中中文占用3个字节，英文占用1个字节
        // utf-16be 编码中中文占用2个字节，英文占用2个字节

        System.out.println();
        System.out.println(new String(bytes1));

    }
}
