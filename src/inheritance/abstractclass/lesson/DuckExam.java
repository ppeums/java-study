package inheritance.abstractclass.lesson;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();

        // Bird를 상속받았으므로 fly 메서드도 쓸 수 있다.
        duck.fly();

        // 추상 클래스는 부모로써의 역할은 가능하지만, 객체를 생성할 수는 없다.
//        Bird b = new Bird();
    }
}
