package com.xenon.practice.java.basics.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ComparableDemo {

    public static void main(String[] args) {
        System.out.println("Comparable demo....");
        ComparableDemo demo = new ComparableDemo();
        LinkedList<Student> list = new LinkedList<>();

        list.add(demo.new Student("aaa", 3, "B"));
        list.add(demo.new Student("bbb", 1, "B"));
        list.add(demo.new Student("ccc", 2, "B"));
        list.add(demo.new Student("ddd", 2, "A"));
        list.add(demo.new Student("zzz", 1, "A"));
        list.add(demo.new Student("yyy", 3, "A"));
        list.add(demo.new Student("xxx", 2, "C"));
        list.add(demo.new Student("mmm", 3, "C"));
        list.add(demo.new Student("nnn", 1, "C"));

        System.out.println(list);
        System.out.println("After sorting....");
        Collections.sort(list);
        System.out.println(list);

    }

    class Student implements Comparable<Student> {
        private String name;
        private int roll;
        private String sec;

        public Student(String name, int roll, String sec) {
            this.name = name;
            this.roll = roll;
            this.sec = sec;
        }

        public String getName() {
            return name;
        }

        public int getRoll() {
            return roll;
        }

        public String getSec() {
            return sec;
        }

        @Override
        public int compareTo(Student obj) {
            int pos = this.sec.compareTo(obj.sec);

            if (pos == 0)
                pos = Integer.compare(this.roll, obj.roll);

            if (pos == 0)
                pos = this.name.compareTo(obj.name);
            return pos;
        }

        @Override
        public String toString() {
            return "sec : " + sec + " roll : " + roll + " name : " + name + "\n";
        }
    }
}
