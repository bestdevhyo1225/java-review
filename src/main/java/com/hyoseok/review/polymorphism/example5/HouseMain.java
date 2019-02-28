package com.hyoseok.review.polymorphism.example5;

public class HouseMain {

    public static void main(String[] args) {
        Father steve = new Steve();
        Mather rachel = new Rachel();

        steve.clean();
        rachel.cook();
    }

}
