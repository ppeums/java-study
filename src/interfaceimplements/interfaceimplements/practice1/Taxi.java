package interfaceimplements.interfaceimplements.practice1;

public class Taxi implements Meter {
    // Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
    @Override
    public void start() {

    }

    @Override
    public int stop(int distance) {
        return distance * 2;
    }
}
