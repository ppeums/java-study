package javapackage.javalang.autoboxing.lesson;

public class WrapperExam {
    public static void main(String[] args) {

        // 기본형 타입
        int i = 5;

        // int를 객체로 바꿔주는 Integer클래스 (Wrapper 클래스 중 하나)
        Integer i2 = new Integer(5);    // 숫자 5를 객체형(참조형)으로 사용

        /**
         * 오토박싱
         * : 기본타입 데이터를 객체타입 데이터로 자동 형변환
         */
        Integer i3 = 5;     // 컴파일러가 자동으로 new Integer(5);로 바꿔서 동작한다.

        /**
         * 오토언박싱
         * : 객체타입 데이터를 기본타입 데이터로 자동 형변환 (오토박싱과 반대)
         */
        int i4 = i3;        // 컴파일러가 자동으로 i3.intValue();로 바꿔서 동작한다.
    }
}
