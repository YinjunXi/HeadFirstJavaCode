package com.muhlenxi;

/**
 * Created by yangxi on 2017/5/11.
 */
public class Book {
    // 成员变量
    private String name;
    private int serialNumber;

    // 构造器
    public Book() {

    }

    public Book(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "book: " + name;
    }

    // Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
