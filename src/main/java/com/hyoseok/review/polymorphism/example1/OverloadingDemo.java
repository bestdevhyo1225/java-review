package com.hyoseok.review.polymorphism.example1;

// 오버로딩은 메소드에서 다형성이라고 볼 수 있다.
public class OverloadingDemo {

    public void a(int param) {
        System.out.println("숫자 출력 : " + param);
    }

    public void a(String param) {
        System.out.println("문자열 출력 : " + param);
    }

}
