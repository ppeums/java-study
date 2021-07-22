package interfacedefault.practice;

public class Taxi implements Meter {
    public void start() {
        System.out.println("택시가 출발합니다.");
    }

    public int stop(int distance) {
        int fare = distance * 2;
        System.out.println("택시가 도착했습니다. 요금은 " + fare + "입니다.");
        return fare;
    }

    public void afterMidnight() {
        System.out.println("자정이 넘었습니다. 할증이 필요합니다.");
    }
}
