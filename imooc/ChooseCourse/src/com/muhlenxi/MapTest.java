package com.muhlenxi;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
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

    public void testRemove(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的学生ID：");
            String id = scanner.next();
            Student stu = students.get(id);
            if (stu == null) {
                System.out.println("该ID不存在");
                continue;
            } else  {
                students.remove(id);
                System.out.println("已删除该学生：" + stu);
                break;
            }
        }
    }

    // entrySet 遍历 Map
    public void testEntrySet() {
        Set<Map.Entry<String,Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry :
                entrySet) {
            System.out.println("取得键：" + entry.getKey());
            System.out.println("对应的值为：" + entry.getValue());
        }
    }

    public  void testModify() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要修改的学生ID：");
            String id = scanner.next();
            Student student = students.get(id);
            if (student == null) {
                System.out.println("该ID不存在！");
                continue;
            }
            System.out.println("要修改的学生是：" + student);
            System.out.println("请输入修改后的姓名：");
            String name = scanner.next();
            student = new Student(name,id);
            students.put(id,student);
            System.out.println("修改成功");
            break;
        }
    }

    public void testContainsKeyOrValue(){
        System.out.println("请输出要查询的ID");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println("是否包含该学生：" + students.containsKey(id));

        System.out.println("请输入要查询的学生姓名：");
        String name = scanner.next();
        Student stu = new Student(name,null);
        if (students.containsValue(stu)) {
            System.out.println("该学生姓名为：" + name);
        } else {
            System.out.println("该学生不存在");
        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        // mt.testRemove();
        // mt.testModify();
        // mt.testEntrySet();
        mt.testContainsKeyOrValue();

    }
}
