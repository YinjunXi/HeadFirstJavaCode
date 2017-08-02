package com.muhlenxi.chapter2;

public class Ex52 {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
