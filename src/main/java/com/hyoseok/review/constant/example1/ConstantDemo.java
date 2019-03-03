package com.hyoseok.review.constant.example1;

public class ConstantDemo {

    public static void main(String[] args) {
        for (Fruit f : Fruit.values()) {
            System.out.println(f);
            System.out.println("[Color : " + f.getColor() + "]");
            System.out.println("[Price : " + f.getPrice() + "]");
        }
    }

}