package com.muhlenxi;

import java.io.File;

/**
 * Created by yangxi on 2017/5/24.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/yangxi/Desktop/imooc");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        if (!file.exists()) {
            file.mkdir();
        } else {
            // file.delete();
        }

    }
}
