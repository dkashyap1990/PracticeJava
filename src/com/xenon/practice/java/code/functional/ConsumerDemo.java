package com.xenon.practice.java.code.functional;

import java.util.LinkedList;
import java.util.function.Consumer;

class StudentConsumer implements Consumer<Student> {
    @Override
    public void accept(Student student) {
        System.out.println("Student : " + student);
    }
}

public class ConsumerDemo {
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

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        StudentConsumer consumer = new StudentConsumer();
        list.forEach(x -> consumer.accept(x));
    }
}
