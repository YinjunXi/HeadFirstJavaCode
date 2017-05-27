package com.muhlenxi;

import java.io.*;

/**
 * Created by yangxi on 2017/5/27.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("example/fr.text")));
        // BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("example/br.text")));
        PrintWriter printWriter = new PrintWriter("example/pw.text");

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

            //bufferedWriter.write(line);
            //bufferedWriter.newLine();

            printWriter.println(line);
        }
        //bufferedWriter.flush();
        printWriter.flush();
        bufferedReader.close();
        //bufferedWriter.close();
        printWriter.close();
    }
}
