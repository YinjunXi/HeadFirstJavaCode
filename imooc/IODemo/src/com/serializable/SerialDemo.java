package com.serializable;

import java.io.*;

/**
 * Created by yangxi on 2017/5/31.
 */
public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "example/obj.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        Student student = new Student("10010","张三",20);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Student student1 = (Student)objectInputStream.readObject();
        System.out.println(student1);
        objectInputStream.close();
    }
}
