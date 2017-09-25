package com.muhlenxi.chapter2;

public class Ex53 {
    public static void main(String[] args) {
        int a = 3*5*7;
        if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
            System.out.println("能被3、5、7同时整除。");
        } else {
            System.out.println("不能被整除。");
        }
    }
}
