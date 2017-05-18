package com.muhlenxi;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yangxi on 2017/5/12.
 */
public class Student {
    public String name;
    public String id;
    public Set<Course> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new HashSet<Course>();
    }

    public Student() {
        this.courses = new HashSet<Course>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
