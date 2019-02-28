package com.hyoseok.review.polymorphism.example4;

public class SmartPhone implements Game, Movie, Phone {

    public void play() {
        System.out.println("게임 하기");
    }

    public void watch() {
        System.out.println("영화 보기");
    }

    public void call() {
        System.out.println("통화 하기");
    }

}
