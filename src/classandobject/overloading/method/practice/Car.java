package classandobject.overloading.method.practice;

public class Car {
    void run() {
        System.out.println("차가 달립니다.");
    }

    // 정수 하나를 매개변수로 받는 메소드, run을 추가해 보세요.
    void run(int n) {
        System.out.println("차가 " + n + "km를 달립니다.");
    }
}
