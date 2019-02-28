package com.hyoseok.review.classmember.example1;

class ClassMember {
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static() {
        System.out.println(static_variable);
    }
    static void static_instance() {
        // 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
        // System.out.println(instance_variable);
    }
    void instance_static() {
        // 인스턴스 메소드에서는 클래스 변수에 접근할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance() {
        System.out.println(instance_variable);
    }
}

public class ClassMemberMain {
    public static void main(String[] args) {
        ClassMember c = new ClassMember();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 정적 변수에 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> '실패'
        c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드에서 클래스 변수에 접근 -> 성공
        ClassMember.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드에서 인스턴스 변수 접근 -> '실패'
        // why? 인스턴스를 생성하지 않았는데 인스턴스 변수에 접근하려고 하기 때문에
        ClassMember.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> '실패'
        // why? 아직 인스턴스를 생성하지 않았는데 접근하려고 하기 때문에
        // ClassMember.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> '실패'
        // why? 아직 인스턴스를 생성하지 않았는데 접근하려고 하기 때문에
        // ClassMember.instance_instance();
    }
}
// 인스턴스 변수 -> Non-Static Field
// 클래스 변수 -> Static Field
