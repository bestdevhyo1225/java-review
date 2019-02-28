package com.hyoseok.review.format.example1;

public class FormatCharacterMain {
    public static void main(String[] args) {
        // 서식문자
        // 일반문자가 아닌 서식에 사용되는 문자
        // printf() 메서드 이용 : f 는 format(형식)을 뜻함.
        int num1 = 10;
        System.out.println("num : " + num1);    // 일반
        System.out.printf("num(10진수) : %d\n", num1);  // 서식 (10진수)
        System.out.printf("num(8진수) : %o\n", num1);  // 서식 (8진수)
        System.out.printf("num(16진수) : %x\n", num1);  // 서식 (16진수)

        System.out.printf("%c\n", 'a');       // 문자
        System.out.printf("%s\n", "java");    // 문자열

        // 실수
        float f = 1.23f;
        System.out.printf("%f\n", f);

        double d = 1.23456d;
        System.out.printf("%f\n", d);

        ///////////////////////////////////////////////
        // 서식문자 정렬 기능
        System.out.printf("%d\n", 123);
        System.out.printf("%d\n", 1234);
        System.out.printf("%d\n", 12345);

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        //////////////////////////////////////////////
        // 서식문자 소수점제한 기능
        System.out.printf("%f\n", 1.23);
        System.out.printf("%.0f\n", 1.23);
        System.out.printf("%.1f\n", 1.23);
        System.out.printf("%.2f\n", 1.23);
        System.out.printf("%.3f\n", 1.23);
    }
}
