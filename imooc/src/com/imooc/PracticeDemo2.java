package com.imooc;

import java.util.Scanner;

/**
 * Created by yangxi on 2017/5/9.
 * 实现接收三个班级各4名同学的Java成绩，然后计算每个班级学员的平均风
 */
public class PracticeDemo2 {
    public static void main(String[] args) {
        int studentNumber = 4;
        int classNumber = 3;
        double sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1 ; i <= classNumber; i++) {
            System.out.println("------请输入第 "+i+" 个班级的成绩-----");
            sum = 0;
            for (int j = 1; j <= studentNumber ; j++) {
                System.out.println("请输入第 "+j+" 个同学的成绩：");
                sum = sum + scanner.nextInt();
            }
            avg = sum / studentNumber;
            System.out.println("该班的平均分是：" + avg);
        }

    }
}
