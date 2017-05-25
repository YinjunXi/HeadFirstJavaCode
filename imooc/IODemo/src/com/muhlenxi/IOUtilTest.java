package com.muhlenxi;

import java.io.IOException;

/**
 * Created by yangxi on 2017/5/25.
 */
public class IOUtilTest {
    public static void main(String[] args){
//        try {
//            IOUtil.printHex("/Users/yangxi/Desktop/imooc/HelloWorld.java");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            IOUtil.printHexByByteArray("/Users/yangxi/Desktop/imooc/HelloWorld.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
