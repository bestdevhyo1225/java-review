package com.hyoseok.review.polymorphism.example2;

class A {
    public String x() { return "A.x"; }
}

class B extends A {
    // 오버라이딩 하게 되면 오버라이딩한 메소드의 우선순위가 더 높다.
    public String x() { return "B.x"; }
    public String y() { return "y"; }
}

class B2 extends A {
    public String x() { return "B2.x"; }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        // 클래스 B를 인스턴스화 했고, obj 가 클래스 A 타입의 행세를 하고 있다.
        A obj = new B();
        A obj2 = new B2();
        //obj.x();    // 클래스 B 에 메소드 x 가 존재하지 않으므로 부모 클래스 A 의 x 를 호출 한다.
        //obj.y();    // 클래스 A 에 메소드 y 가 정의되어 있지 않다.

        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}
