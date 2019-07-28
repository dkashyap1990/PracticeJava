package com.xenon.practice.java.basics.generics;

class GenericAdder<E, T> {
    T t;
    E e;

    GenericAdder(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getT() {
        return t;
    }

    public E getE() {
        return e;
    }

    String add() {
        if (t instanceof String) {
            return t.toString() + e.toString();
        } else if ((t instanceof Double || e instanceof Integer) && (e instanceof Integer || e instanceof Double)) {
            return (Double.parseDouble(t.toString())
                    + Double.parseDouble(e.toString())) + "";
        }
        return null;
    }

    void show() {
        System.out.println(add());
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        GenericAdder<String, String> g1 = new GenericAdder("I want to", " be happy");
        g1.show();
        GenericAdder<String, Double> g2 = new GenericAdder("My height ", 178.6);
        g2.show();
        GenericAdder<Integer, Integer> g3 = new GenericAdder(10, 20);
        g3.show();
    }
}
