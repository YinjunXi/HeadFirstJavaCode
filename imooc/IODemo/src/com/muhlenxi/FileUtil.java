package com.muhlenxi;

import java.io.File;
import java.io.IOException;

/**
 * Created by yangxi on 2017/5/25.
 * 列出 File 的一些常用操作，比如过滤、遍历等
 */
public class FileUtil {

    /**
     * 列出指定目录下（包括其子目录）的所有文件
     * @param file
     * @throws IOException
     */
    public static void listDirectory (File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException("目录：" + file + "不存在");
        }
        if (!file.isDirectory()){
            throw new IllegalArgumentException(file + "不是目录");
        }
        // 如果要遍历子目录内容
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File file1:files
                    ) {
                if (file1.isDirectory()) {
                    listDirectory(file1);
                } else {
                    System.out.println(file1);
                }
            }
        }
    }
}
