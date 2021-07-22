package innerclass;

public class InnerExam3 {
    public void exec() {

        /**
         * 내부 클래스 형태 3
         * : 메서드 안에 내부 클래스가 선언되는 경우
         * 지역 중첩 클래스 또는 지역 클래스 라고 한다.
         *
         */
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }

        // 메서드 안에서만 해당 클래스를 사용할 수 있다.
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {

        // 메서드 밖에서 사용하는 방법
        // 외부 클래스를 먼저 생성해야한다.
        InnerExam3 t = new InnerExam3();

        // 외부 클래스가 가지고 있는 해당 메서드를 호출할 때,
        // 내부적으로 Cal 클래스가 하나 생성되고,
        // Cal 클래스가 정의되어있는 부분이 수행된다.
        t.exec();
    }
}
