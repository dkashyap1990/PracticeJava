package com.xenon.practice.java.basics.nestedclass;

interface Interface {
    void show();
}

abstract class Abstract {
    abstract void show();
}

public class AnonymousInner {
    public static void main(String[] args) {
        Interface inf = new Interface() {
            @Override
            public void show() {
                System.out.println("Inside Interface show()");
            }
        };
        inf.show();

        Abstract abs = new Abstract() {
            @Override
            void show() {
                System.out.println("Inside Abstract show()");
            }
        };

        abs.show();
    }
}
