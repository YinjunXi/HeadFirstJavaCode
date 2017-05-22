package com.muhlenxi;

import java.util.Comparator;

/**
 * Created by yangxi on 2017/5/22.
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
