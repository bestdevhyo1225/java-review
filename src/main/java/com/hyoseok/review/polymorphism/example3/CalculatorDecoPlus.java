package com.hyoseok.review.polymorphism.example3;

public class CalculatorDecoPlus extends Calculator {

    public void decorate_sum() {
        System.out.println("+ sum : " + get_sum());
    }

    public void decorate_avg() {
        System.out.println("- sum : " + get_avg());
    }

}
