package com.hyoseok.review.array.example1;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        // 1차원 배열
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = null;
        int[] arr3 = null;

        // 배열의 길이
        System.out.println("arr1 length : " + arr1.length);

        // 배열의 요소 출력
        System.out.println("arr1 : " + Arrays.toString(arr1));

        // 배열의 요소 복사
        arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr2 : " + Arrays.toString(arr3));

        // 배열의 레퍼런스
        arr2 = arr1;
        System.out.println("arr1 : " + arr1);
        System.out.println("arr2 : " + arr2);
        System.out.println("arr3 : " + arr3);

        // 다 차원 배열
        int[][] arrMul = new int[3][2];
        arrMul[0][0] = 1;
        arrMul[0][1] = 2;

        arrMul[1][0] = 3;
        arrMul[1][1] = 4;

        arrMul[2][0] = 5;
        arrMul[2][1] = 6;

        System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
        System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
        System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));
    }
}
