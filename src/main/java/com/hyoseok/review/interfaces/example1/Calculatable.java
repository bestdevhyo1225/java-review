package com.hyoseok.review.interfaces.example1;

// 인터페이스와 상속은 다르다.
// 상속이 상위 클래스의 기능을 하위 클래스가 물려 받는 것이라고 한다면,
// 인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제한다.

// 명세서에 정의되어 있는 기능들..
public interface Calculatable {

    public void setOprands(int first, int second, int third);
    public int sum();
    public int avg();

}
