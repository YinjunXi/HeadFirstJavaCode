package com.muhlenxi.chapter2;

public class Ex54 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 200) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        i = 0;
        sum = 0;
        do {
            sum += i;
            i += 1;
        } while (i < 200);
        System.out.println(sum);
    }
}
