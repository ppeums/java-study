package interfaceimplements.interfaceimplements.lesson;

public class LedExam {
    public static void main(String[] args) {

        // 참조변수의 타입으로 인터페이스를 사용할 수 있다.
        // 이 경우, 인터페이스가 가지고 있는 메서드만 사용할 수 있다.
        TV tv = new LedTV();

        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();

        // TV가 가지지 않은 기능들을 LedTV가 확장해서 사용하고 있을 때,
        // 그 기능들을 사용하고 싶다면 클래스 형변환을 하면 된다.
        LedTV led = (LedTV) tv;
        led.turnOn();
        led.changeChannel(10);
        led.changeVolume(20);
        led.savePower();
        led.turnOff();

        // 클래스는 이러한 인터페이스를 여러 개 구현할 수 있다.
//        TV tv = new LcdTV();
    }
}
