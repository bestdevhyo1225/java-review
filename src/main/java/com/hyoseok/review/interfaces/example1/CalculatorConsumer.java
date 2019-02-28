package com.hyoseok.review.interfaces.example1;

// CalculatorDummy 클래스는 가짜 클래스..
/*class CalculatorDummy implements Calculatable {

    public void setOprands(int first, int second, int third) {}

    public int sum () {
        return 60;
    }

    public int avg() {
        return 20;
    }

}*/

public class CalculatorConsumer {

    public static void main(String[] args) {
        // 진짜 클래스인 Calculator 클래스가 제작중에 있고 다 완성되서 사용하려면 오랜 시간이 걸린다.
        // 따라서 시간을 절약하기 위해 가짜 클래스인 CalculatorDummy 를 미리 만들어서 나머지 로직을 미리 완성 시켜놓으려고 한다.
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }

}
