package overloading.constructor.lesson;

public class Car {
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        // 코드가 중복된다.
//        this.name = "이름없음";
//        this.number = 0;

        /**
         * this(): 자신의 생성자를 호출한다.
         * 코드의 중복을 방지한다.
         */
        this("이름없음", 0);
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
