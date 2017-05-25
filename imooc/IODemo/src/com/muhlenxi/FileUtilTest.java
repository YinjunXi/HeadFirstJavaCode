package com.muhlenxi;

import java.io.File;
import java.io.IOException;

/**
 * Created by yangxi on 2017/5/25.
 */
public class FileUtilTest {
    public static void main(String[] args) throws IOException{
        FileUtil.listDirectory(new File("/Users/yangxi/Desktop/xiaomi"));
    }
}
