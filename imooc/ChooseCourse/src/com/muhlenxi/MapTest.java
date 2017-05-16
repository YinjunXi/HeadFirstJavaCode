package com.muhlenxi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by muhlenXi on 2017/5/16.
 */
public class MapTest {
    public HashMap<String,Student> students;

    public MapTest() {
        this.students = new HashMap<String,Student>();
    }

    public void testPut() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 3) {
            System.out.println("请输入学生ID：");
            String id = scanner.next();
            Student stu = students.get(id);
            if (stu == null) {
                System.out.println("请输入学生姓名");
                String name = scanner.next();
                stu = new Student(name,id);
                students.put(id,stu);
                System.out.println("成功添加：" + stu);
                i++;
            } else  {
                System.out.println("该ID已经被占用");
                continue;
            }
        }
    }

    public void testKeySet() {
        Set<String> keySet = students.keySet();
        System.out.println("一共有" + students.size() + "个学生");
        for (String stuID : keySet
             ) {
            Student stu = students.get(stuID);
            if (stu != null) {
                System.out.println(stu);
            }
        }

    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();

    }
}
