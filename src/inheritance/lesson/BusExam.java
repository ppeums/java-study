package inheritance.lesson;

public class BusExam {
    public static void main(String[] args) {

        // Bus class는 아무런 코드를 가지지 않았지만,
        // Car class를 상속받음으로써 run 메서드를 상속받았다.
        // 그래서 run 메서드를 사용하는데 문제가 없다.
        Bus bus = new Bus();
        bus.run();

        bus.ppangppang();

        Car car = new Car();
        car.run();

        // 부모 클래스는 자식이 갖고 있는 것을 사용할 수 없다.
//        car.ppangppang();
    }
}
