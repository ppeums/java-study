package innerclass;

public class InnerExam {

    /**
     * 내부 클래스
     * : 클래스 안에 선언된 클래스
     *
     * 내부 클래스 형태 1
     * : 클래스 안에 필드를 선언하는 위치에 내부 클래스가 선언되는 경우
     * 중첩 클래스 또는 인스턴스 클래스 라고 한다.
     */
    class Cal {

        // 기존의 클래스 선언과 동일하게 필드를 선언할 수도 있고,
        int value = 0;

        // 메서드를 정의할 수도 있다.
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {

        // 내부 클래스는 혼자 독자적으로 생성될 수는 없다.
        // 반드시 외부에 있는 클래스가 먼저 만들어져야한다.
        InnerExam t = new InnerExam();

        // 그 후, 내부에 있는 Cal 객체를 생성해서 사용한다.
        // 타입 선언 방법: 외부클래스타입.내부클래스타입
        InnerExam.Cal cal = t.new Cal();

        // 내부 클래스에 있는 메서드 호출
        cal.plus();
        // 내부 클래스의 필드에 접근
        System.out.println(cal.value);

    }
}
