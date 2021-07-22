package interfaceimplements.lesson;

// LedTV 클래스가 TV 인터페이스를 구현한다.
// LedTV는 반드시 TV가 가지고 있는 모든 기능들을 구현해야한다.
public class LedTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조정하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 조정하다");
    }

    public void savePower() {
        System.out.println("절전모드로 전환하다");
    }
}
