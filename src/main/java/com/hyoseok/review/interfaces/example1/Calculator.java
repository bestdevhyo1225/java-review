package com.hyoseok.review.interfaces.example1;

// 인터페이스와 상속은 다르다.
// 상속이 상위 클래스의 기능을 하위 클래스가 물려 받는 것이라고 한다면,
// 인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제한다.

public class Calculator implements Calculatable {

    private int first;
    private int second;
    private int third;

    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int sum() {
        return this.first + this.second + this.third;
    }

    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }

}
