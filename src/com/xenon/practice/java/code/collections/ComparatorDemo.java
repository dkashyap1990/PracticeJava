package com.xenon.practice.java.code.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorDemo {
    public static void main(String[] args) {
        System.out.println("Comparable demo....");
        ComparatorDemo demo = new ComparatorDemo();
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
        System.out.println("After sorting with Roll....");
        Collections.sort(list, demo.new RollComparator());
        System.out.println(list);

        System.out.println("After sorting with Name....");
        Collections.sort(list, demo.new NameComparator());
        System.out.println(list);
    }

    class Student {
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
        public String toString() {
            return "sec : " + sec + " roll : " + roll + " name : " + name + "\n";
        }
    }

    class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class RollComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.roll, o2.roll);
        }
    }
}
