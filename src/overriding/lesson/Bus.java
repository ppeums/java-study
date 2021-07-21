package overriding.lesson;

public class Bus extends Car {

    /**
     * 오버라이딩
     * : 부모가 가지고 있는 메서드와 똑같은 모양의 메서드를 자식이 가지고 있는 것
     *   부모 클래스의 메서드를 자식 클래스에서 재정의하여 사용하는 것
     */
    // 부모의 run 메서드를 재정의
    public void run() {

        // super 키워드를 사용하여 자식 클래스에서 부모 클래스의 메서드 호출
        super.run();

        System.out.println("Bus의 run 메서드");
    }
}
