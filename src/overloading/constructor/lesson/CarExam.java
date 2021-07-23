package overloading.constructor.lesson;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car("소방차");

        /**
         * 기본 생성자
         * : Car 객체에 생성자가 하나도 없을 때는 자동으로 만들어진다.
         * 하지만 생성자를 하나라도 정의하게 되면, 자동으로 만들어지지 않는다.
         */
        Car c2 = new Car();

        Car c3 = new Car("구급차", 1111);
    }
}
