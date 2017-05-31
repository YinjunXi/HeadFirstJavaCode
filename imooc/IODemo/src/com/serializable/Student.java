package com.serializable;

import java.io.Serializable;

/**
 * Created by yangxi on 2017/5/31.
 */
public class Student implements Serializable{
    private String number;
    private String name;
    // transient 修饰的元素不会进行默认序列化，也可以自己完成该元素的序列化
    private transient int age;

    public Student(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException,ClassNotFoundException {
        // 把 jvm 能默认系列化的元素进行序列化
        s.defaultWriteObject();
        // 自己完成 age 的序列化
        s.writeInt(age);
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException,ClassNotFoundException {
        // 把 jvm 能默认反序列化的元素进行反序列化操作
        s.defaultReadObject();
        // 自己完成 age 的反序列化
        this.age = s.readInt();
    }
}

