package com.hyoseok.review.inheritance.example1;

// 멤버 변수 또는 메소드 중에 하나라도 abstract 키워드를 가지고 있다면
// 해당 클래스는 abstract 클래스이다.
abstract class A {
    public abstract int b();

    // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    /*public abstract int c() {
        System.out.println("Hello");
    }*/

    // 추상클래스 내에서는 추상 메소드가 아닌 메소드가 존재할 수 있다.
    public void d() {
        System.out.println("World");
    }
}

class B extends A {
    public int b() {
        return 1;
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 반드시 상속해서 사용해야 된다.
        // A obj = new A();
        B obj = new B();
    }
}
