package com.muhlenxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yangxi on 2017/5/12.
 * 备选课程
 */
public class ListTest {
    public List<Course> courseToSelect; // 用于存放备选课程

    public ListTest() {
        this.courseToSelect = new ArrayList<Course>();
    }

    public void listAdd() {
        Course c1 = new Course("1","数据结构");
        courseToSelect.add(c1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加了课程: " + temp.id + ":" + temp.name);

        Course c2 = new Course("2","C语言");
        courseToSelect.add(0,c2);

        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

        Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
        courseToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + " 和 " + temp4.id + ":" + temp4.name);

        Course[] courses2 =  {new Course("5","高等数学"),new Course("6","大学英语")};
        courseToSelect.addAll(2,Arrays.asList(courses2));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + " 和 " + temp6.id + ":" + temp6.name);
    }

    public void testGet() {
        int size = courseToSelect.size();
        System.out.println("有如下课程可供选择：");
        for (int i = 0; i < size; i++) {
            Course c = (Course) courseToSelect.get(i);
            System.out.println("课程：" + c.id + " : " + c.name);
        }
    }

    // 通过迭代器来遍历list
    public void testIterator() {
        System.out.println("有如下课程可选：");
        Iterator it = courseToSelect.iterator();
        while (it.hasNext()) {
            Course c = (Course) it.next();
            System.out.println("课程：" + c.id + " : " + c.name);
        }
    }

    public void testModify() {
        courseToSelect.set(0,new Course("0","毛概"));
    }

    public void testRemove() {

        Course c1 = (Course) courseToSelect.get(0);
        courseToSelect.remove(c1);
    }

    public static void main(String[] args) {

        ListTest test = new ListTest();
        test.listAdd();
        test.testGet();
        test.testModify();
        test.testRemove();
        test.testIterator();
    }
}
