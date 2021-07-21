package abstractclass.lesson;

/**
 * 추상 클래스
 * : 메서드가 하나라도 추상 메서드인 경우, 해당 클래스는 추상 클래스이다.
 */
public abstract class Bird {

    // 추상 메서드는 구현하지 않는다.
    public abstract void sing();

    // 추상 클래스라도 일반 메서드를 구현할 수 있다.
    public void fly() {
        System.out.println("날다.");
    }
}
