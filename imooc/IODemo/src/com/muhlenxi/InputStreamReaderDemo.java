package com.muhlenxi;

import java.io.*;

/**
 * Created by yangxi on 2017/5/27.
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream("example/copybuffer.dat");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        FileOutputStream outputStream = new FileOutputStream("example/osw.dat");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        int c;
        while ((c = inputStreamReader.read()) != -1) {
            System.out.print((char) c);
            outputStreamWriter.write(c);
        }



        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
