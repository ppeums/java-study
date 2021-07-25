package interfaceimplements.defaultmethod.lesson;

public class MyCalcTest {
    public static void main(String[] args) {
        Calculator calc = new MyCalc();
        calc.plus(3, 4);

        // 인터페이스에 default로 구현한 메서드를 사용할 수 있다.
        int i = calc.exec(5, 6);
        System.out.println(i);

        // 인터페이스에 정의한 static 메서드는
        // 반드시 인터페이스명.메서드명() 형식으로만 호출해야한다.
        Calculator.exec2(3, 4);

        // 참조변수명.메서드명() 으로는 호출할 수 없다.
//        calc.exec2(3, 4);
    }
}
