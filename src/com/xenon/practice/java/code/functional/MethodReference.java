package com.xenon.practice.java.code.functional;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Student {
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

public class MethodReference {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();

        Student s1 = new Student();
        s1.setRoll(1);
        s1.setName("aaa");
        Student s2 = new Student();
        s2.setRoll(2);
        s2.setName("bbb");
        Student s3 = new Student();
        s3.setRoll(3);
        s3.setName("ccc");
        Student s4 = new Student();
        s4.setRoll(4);
        s4.setName("ddd");
        Student s5 = new Student();
        s5.setRoll(5);
        s5.setName("eee");

        list.add(s5);
        list.add(s1);
        list.add(s3);
        list.add(s2);
        list.add(s4);


        System.out.println(list);
        Collections.sort(list, Comparator.comparing(Student::getRoll));
        System.out.println(list);
    }
}
