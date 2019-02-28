package com.hyoseok.review.polymorphism.example3;

public class CalculatorDecoMinus extends Calculator {

    public void decorate_sum() {
        System.out.println("- sum : " + get_sum());
    }

    public void decorate_avg() {
        System.out.println("- avg : " + get_avg());
    }

}
