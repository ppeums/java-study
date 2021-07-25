package innerclass.staticclass;

public class InnerExam2 {

    /**
     * 내부 클래스 형태 2
     * : 내부 클래스가 static으로 정의된 경우
     * 정적 중첩 클래스 또는 static 클래스 라고 한다.
     */
    static class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {

        // 외부 클래스를 먼저 생성할 필요 없이, 바로 접근해서 사용할 수 있다.
        // 외부클래스명.내부클래스명()으로 접근할 수 있다.
        // (static 한 필드를 클래스명.필드명()으로 접근했던 것처럼)
        InnerExam2.Cal cal = new InnerExam2.Cal();

        // 사용방법은 동일하다.
        cal.plus();
    }
}
