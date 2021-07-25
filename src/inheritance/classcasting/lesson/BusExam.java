package inheritance.classcasting.lesson;

public class BusExam {
    public static void main(String[] args) {

        /**
         * 부모 = 큰 그릇, 자식 = 작은 그릇
         * "작은 그릇에 들어있는 것을 큰 그릇으로 담을 수 있지만,
         *  큰 그릇에 들어있는 것을 작은 그릇으로 담을 수 없다."
         *
         * 부모 타입으로 자식을 가리킬 수 있다.
         * 이 경우, 부모가 가지고 있는 메서드만 사용할 수 있다.
         */
        Car c = new Bus();
        c.run();
//        c.ppangppang();       // Bus의 ppangppang 메서드는 사용할 수 없다.

//        Bus bus = c;          // 자식 타입은 부모를 가리킬 수 없다.
                                // Car에 어떤 차가 올지 모르는데, 그것을 Bus라고 할 수는 없다.

        /**
         * 부모 타입을 자식 타입으로 형변환
         * Car가 처음 생성될 때 Bus로 생성되었기 때문에, Bus로 타입을 바꾸는 것이 가능하다.
         */
        Bus bus = (Bus) c;
        bus.run();
        bus.ppangppang();       // Bus의 ppangppang 메서드를 사용할 수 있다.
    }
}
