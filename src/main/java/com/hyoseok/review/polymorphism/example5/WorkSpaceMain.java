package com.hyoseok.review.polymorphism.example5;

public class WorkSpaceMain {

    public static void main(String[] args) {
        Programmer steve = new Steve();
        Programmer rachel = new Rachel();

        steve.coding();
        rachel.coding();
    }

}
