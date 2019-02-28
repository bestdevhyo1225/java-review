package com.hyoseok.review.polymorphism.example6;

public class ESCKey extends KeyBoard {

    public void keyPressDown() {
        System.out.println("종료");
    }

    public void keyPressDown_10sec() {
        System.out.println("임시 대기");
    }

}
