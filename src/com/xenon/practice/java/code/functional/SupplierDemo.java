package com.xenon.practice.java.code.functional;

import java.util.LinkedList;
import java.util.function.Supplier;

class StudentSupplier implements Supplier<Student> {
    @Override
    public Student get() {
        return new Student();
    }
}

public class SupplierDemo {
    public static void main(String[] args) {
        StudentSupplier supplier = new StudentSupplier();

        Student s1 = supplier.get();
        s1.setRoll(1);
        s1.setName("aaa");
        Student s2 = supplier.get();
        s2.setRoll(2);
        s2.setName("bbb");
        Student s3 = supplier.get();
        s3.setRoll(3);
        s3.setName("ccc");
        Student s4 = supplier.get();
        s4.setRoll(4);
        s4.setName("ddd");
        Student s5 = supplier.get();
        s5.setRoll(5);
        s5.setName("eee");

        LinkedList<Student> students = new LinkedList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students);
    }
}
