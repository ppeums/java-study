package overloading.method.practice;

// 실행을 위한 코드입니다.
public class CarExam {
    public static void main(String[] args) {
        // Person클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
        Car car = new Car();

        car.run();
        // int형 매개변수를 받는 run을 호출합니다.
        car.run(100);
    }
}
