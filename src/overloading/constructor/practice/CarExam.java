package overloading.constructor.practice;

// 실행을 위한 코드입니다.
public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자동차");
        Car car3 = new Car("자동차", 1234);
    }
}
