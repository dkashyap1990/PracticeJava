package com.xenon.practice.java.basics;

class Calculator {
    private double length, width;

    Calculator() {
        this(0, 0);
    }

    Calculator(double x) {
        this(x, x);
    }

    Calculator(double width, double length) {
        this.length = length;
        this.width = width;
    }

    Calculator(Calculator calc) {
        this(calc.width, calc.length);
    }

    void getArea() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Area   : " + length * width);
        System.out.println();
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator(10.5);
        Calculator cal3 = new Calculator(12.5, 14.5);
        Calculator cal4 = new Calculator(cal2);

        cal1.getArea();
        cal2.getArea();
        cal3.getArea();
        cal4.getArea();
    }
}
