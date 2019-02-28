package com.hyoseok.review.polymorphism.example3;

public abstract class Calculator {

    private int left;
    private int right;

    public abstract void decorate_sum();
    public abstract void decorate_avg();

    public void run() {
        decorate_sum();
        decorate_avg();
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    protected int get_sum() {
        return this.left + this.right;
    }

    protected int get_avg() {
        return  (this.left + this.right) / 2;
    }
}
