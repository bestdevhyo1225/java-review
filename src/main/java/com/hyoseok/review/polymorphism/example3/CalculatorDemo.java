package com.hyoseok.review.polymorphism.example3;

public class CalculatorDemo {

    public static void execute(Calculator cal) {
        System.out.println("실행");
        cal.run();
    }

    public static void main(String[] args) {
        Calculator cal_deco_plus = new CalculatorDecoPlus();
        Calculator cal_deco_minus = new CalculatorDecoMinus();

        cal_deco_plus.setOprands(10,20);
        cal_deco_minus.setOprands(10, 20);

        execute(cal_deco_plus);
        execute(cal_deco_minus);

        System.out.println("구체 빌더 클래스 테스트");
        Calculator2 cal2 = new Calculator2
                .Builder(10, 20)
                .decorate("+")
                .build();

        cal2.decorate_sum();
        cal2.decorate_avg();
    }

}
