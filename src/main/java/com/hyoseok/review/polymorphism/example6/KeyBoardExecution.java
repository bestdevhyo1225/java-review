package com.hyoseok.review.polymorphism.example6;

public class KeyBoardExecution {

    public static void main(String[] args) {
        KeyBoard number_zero_key = new NumberZeroKey();
        KeyBoard enter_key = new EnterKey();
        KeyBoard esc_key = new ESCKey();

        // 자식 NumberZeroKey 클래스에 행위가 정의되지 않아서 부모클래스인 KeyBoard 의 행위를 실행한다.
        // 오버라이딩 하지 않음
        number_zero_key.keyPressDown();     //  "?" 출력

        // 오버라이딩 했음
        // (중요!) 오버라이딩을 하면 자식 클래스에 정의한 메소드의 우선순위가 높다!!
        enter_key.keyPressDown();           // "실행" 출력
        esc_key.keyPressDown();             // "종료" 출력

        // 상식적으로 생각해보면 KeyBoard 는 누르는 기본적인 행위 밖에 없다.
        // 따라서 KeyBoard 클래스에는 기본적으로 10초동안 키를 누르는 행위가 없다.
        // ESCKey 클래스를 인스턴스화 하고나서, ens_key 객체는 부모인 KeyBoard 인 행세를 한다.
        // 부모인 KeyBoard 인 행세를 한다? -> KeyBoard 클래스에 있는 행위만 실행할 수 있다.
        // esc_key.keyPressDown_10sec();
    }

}
