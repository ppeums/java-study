package interfaceimplements.lesson;

/**
 * 인터페이스
 * : 구현은 없고, 무엇을 가지고 있을지만 선언한다.
 * 자체적으로 타입의 역할은 할 수 있지만, 구현이 없기 때문에 객체를 생성할 수는 없다.
 */
public interface TV {

    // 추상 메서드와 상수를 정의할 수 있다.
    // abstract와 final을 붙이지 않아도 된다.

    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
