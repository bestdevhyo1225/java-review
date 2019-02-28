package com.hyoseok.review.classcreate.example1;

class ObjectClass {

}

public class ObjectClassMain {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        // 자료형이 같아도 다른 공간에 존재하는 객체는 다른 객체이다.
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        if (obj1 == obj3) {
            System.out.println("obj1 == obj3");
        } else {
            System.out.println("obj1 != obj3");
        }

        if (obj2 == obj3) {
            System.out.println("obj2 == obj3");
        } else {
            System.out.println("obj2 != obj3");
        }


    }
}
