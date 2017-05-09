package com.imooc;

import java.util.Scanner;

/**
 * Created by yangxi on 2017/5/9.
 */
public class PracticeDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩信息：");
        int score = scanner.nextInt();
        int count = 0;
        System.out.println("加分前成绩：" + score);
        while (score < 60) {
            score++;
            count++;
        }
        System.out.println("加分后成绩：" + score);
        System.out.println("总共加了"+ count +"次");

    }
}
