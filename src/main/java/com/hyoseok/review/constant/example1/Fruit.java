package com.hyoseok.review.constant.example1;
/*
class Fruit {

    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();

}*/

// enum 의 내용은 위의 class 내용과 동일하다.
enum Fruit {

    APPLE("Red", 1000), PEACH("Pink", 1500), BANANA("Yellow", 3000), GRAPE("Purple", 2500),
    ORANGE("Orange", 3200), MELON("Light Green", 2500);

    private String color;
    private int price;

    Fruit(String color, int price) {
        System.out.println("Call Constructor " + this);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

}
