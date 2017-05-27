package com.muhlenxi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yangxi on 2017/5/27.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("example/osw.dat");
        FileWriter fileWriter = new FileWriter("example/fr.text");
        char[] buffer = new char[2 * 1024];
        int c;
        while ((c = fileReader.read(buffer,0,buffer.length)) != -1) {
            fileWriter.write(buffer,0,c);
        }
        fileWriter.flush();
        fileReader.close();
        fileWriter.close();

    }

}
