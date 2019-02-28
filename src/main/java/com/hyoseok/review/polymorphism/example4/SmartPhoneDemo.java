package com.hyoseok.review.polymorphism.example4;

public class SmartPhoneDemo {

    public static void main(String[] args) {
        // 스마트폰의 통화하기, 게임하기, 영화하기 기능을 이용하고 싶다면
        // 스마트폰 클래스 자체를 참조
        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.call();
        smartPhone1.play();
        smartPhone1.watch();

        // 스마트폰의 통화하기 기능만 사용하고 싶다면
        // 폰 인터페이스를 참조
        Phone smartPhone2 = new SmartPhone();
        smartPhone2.call();
        //smartPhone2.play();
        //smartPhone2.watch();

        // 스마트폰의 게임하기 기능만 사용하고 싶다면
        // 게임 인터페이스를 참조
        Game smartPhone3 = new SmartPhone();
        smartPhone3.play();
        //smartPhone3.call();
        //smartPhone3.watch();

        // 스마트폰의 영화보기 기능만 사용하고 싶다면
        // 영화 인터페이스를 참조
        Movie smartPhone4 = new SmartPhone();
        smartPhone4.watch();
        //smartPhone4.call();
        //smartPhone4.play();
    }

}
