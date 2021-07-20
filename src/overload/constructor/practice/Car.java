package overload.constructor.practice;

public class Car {
    String name;
    int number;

    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    Car() {
        this("이름없음", 0);
    }

    Car(String name) {
        this(name, 0);
    }
}
