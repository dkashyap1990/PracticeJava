package com.xenon.practice.java.basics;

class AreaCalculator {
    void getArea() {
        this.getArea(0, 0);
    }

    void getArea(double x) {
        this.getArea(x, x);
    }

    void getArea(double length, double width) {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Area   : " + calculate(length, width));
        System.out.println();
    }

    private double calculate(double length, double width) {
        return length * width;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.getArea();
        calculator.getArea(25.5);
        calculator.getArea(14.5, 16.5);
    }
}
