package inheritance.overriding.practice;

public class Bus extends Car {
    // run 메소드를 오버라이드 하세요. 메소드의 접근 제한자는 public이어야 합니다.
    public void run() {
        // Car 클래스의 run을 호출합니다.
        super.run();
        System.out.println("차가 달리면서 다음 정거장을 안내합니다.");
    }
}
