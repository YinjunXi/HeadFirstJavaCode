package com.muhlenxi;

/**
 * Created by yangxi on 2017/5/12.
 * 课程类
 */
public class Course {
    public String id;
    public String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return  false;
        if (obj == this)
            return true;
        if (!(obj instanceof Course))
            return false;
        Course course = (Course) obj;
        if (course.name == null)
            return false;
        if (this.name.equals(course.name))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
