package com.muhlenxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by yangxi on 2017/5/19.
 */
public class CollectionTest {

    public void testIntegerSort(){

        List<Integer> list = new ArrayList<Integer>();
        Integer number;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            do {
                number = random.nextInt(100);
            } while (list.contains(number));
             list.add(number);
            System.out.println("添加了：" + number);
        }

        System.out.println("--- 排序前 ---");
        for (Integer num: list) {
            System.out.println(num);
        }

        Collections.sort(list);
        System.out.println("--- 排序后 ---");
        for (Integer num: list) {
            System.out.println(num);
        }

    }

    public void testStringSort() {
        List<String> list = new ArrayList<String>();
        list.add("Google");
        list.add("Apple");
        list.add("Microsoft");
        list.add("Tencent");
        list.add("Alibaba");

        System.out.println("--- 排序前 ---");
        for (String str:list
             ) {
            System.out.println(str);
        }

        Collections.sort(list);
        System.out.println("--- 排序后 ---");
        for (String str:list
                ) {
            System.out.println(str);
        }
    }

    public void testStringSort2() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String string = new String();

            // 随机生成字符串长度
            int length = 1;
            do {
                length = (int) (Math.random() * 10);
            }while (length == 0);
            String str = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            Random random = new Random();
            int num ;
            for (int j = 0; j < length; j++) {
                num = random.nextInt(55);
                string += str.charAt(num);
            }
            list.add(string);
            System.out.println("加入了字符串：" + string);
        }


        System.out.println("--- 排序前 ---");
        for (String str:list
                ) {
            System.out.println(str);
        }

        Collections.sort(list);
        System.out.println("--- 排序后 ---");
        for (String str:list
                ) {
            System.out.println(str);
        }
    }

    public void testSortStudent(){
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();
        studentList.add(new Student("Jack",random.nextInt(1000) + ""));
        studentList.add(new Student("Lucy",random.nextInt(1000) + ""));
        studentList.add(new Student("Bob",random.nextInt(1000) + ""));
        System.out.println("--- 排序前 ---");
        for (Student stu:studentList
             ) {
            System.out.println(stu);
        }
        Collections.sort(studentList);
        System.out.println("--- 排序后 ---");
        for (Student stu:studentList
                ) {
            System.out.println(stu);
        }

        Collections.sort(studentList,new StudentComparator());
        System.out.println("--- 根据名字排序后 ---");
        for (Student stu:studentList
                ) {
            System.out.println(stu);
        }

    }

    public static void main(String[] args) {
        CollectionTest ct = new CollectionTest();
        // ct.testIntegerSort();
        // ct.testStringSort2();
        ct.testSortStudent();
    }

}
