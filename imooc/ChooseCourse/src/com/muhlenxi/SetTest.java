package com.muhlenxi;

import java.util.*;

/**
 * Created by yangxi on 2017/5/15.
 */
public class SetTest {
    public Set<Course> courseToSelect; // 用于存放备选课程

    public SetTest() {
        this.courseToSelect = new HashSet<Course>();
    }

    public void testAdd() {
        Course c1 = new Course("1","数据结构");
        courseToSelect.add(c1);
        Course c2 = new Course("2","C语言");
        courseToSelect.add(c2);
        Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
        courseToSelect.addAll(Arrays.asList(courses));
        Course[] courses2 =  {new Course("5","高等数学"),new Course("6","大学英语")};
        courseToSelect.addAll(Arrays.asList(courses2));

    }

    public void testforeach() {
        System.out.println("有如下课程可选：");
        for (Course course:courseToSelect
             ) {
            System.out.println("课程：" + course.id + ":" + course.name);
        }
    }

    public void testforeach(Student student) {
        System.out.println("该学生的选课情况如下：");
        for (Course course:student.courses
                ) {
            System.out.println("课程：" + course.id + ":" + course.name);
        }
    }
    public static void main(String[] args) {
        SetTest setTest = new SetTest();
        Student student = new Student("小明","1");
        Scanner scanner = new Scanner(System.in);
        setTest.testAdd();
        setTest.testforeach();

        for (int i = 0; i < 3; i++) {
            System.out.println("输入要选择的课程序号：");
            String choose = scanner.next();
            for (Course course:setTest.courseToSelect
                    ) {
                if (course.id.equals(choose)){
                    student.courses.add(course);
                }
            }
        }

        setTest.testforeach(student);

    }
}
