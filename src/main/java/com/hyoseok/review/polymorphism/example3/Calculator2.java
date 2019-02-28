package com.hyoseok.review.polymorphism.example3;

public class Calculator2 {

    private final String decoration;
    private final int left;
    private final int right;

    public static class Builder {
        // 선택 매개변수
        private String decoration = "";
        // 필수 매개변수
        private final int left;
        private final int right;

        public Builder(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public Builder decorate(String val) { this.decoration = val; return this; }

        public Calculator2 build() {
            return new Calculator2(this);
        }
    }

    private Calculator2(Builder builder) {
        this.decoration = builder.decoration;
        this.left = builder.left;
        this.right = builder.right;
    }

    public void decorate_sum() {
        System.out.println(decoration + " sum : " + (this.left + this.right));
    }

    public void decorate_avg() {
        System.out.println(decoration + " avg : " + (this.left + this.right) / 2);
    }

}
