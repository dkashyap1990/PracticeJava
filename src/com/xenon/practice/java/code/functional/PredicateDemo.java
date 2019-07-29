package com.xenon.practice.java.code.functional;

import java.util.function.Predicate;


class AdultChecker implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer >= 21;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {

        AdultChecker adultChecker = new AdultChecker();
        System.out.println(adultChecker.test(20));
    }
}
