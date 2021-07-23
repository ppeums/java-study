package exceptionhandling.exception.lesson;

/**
 * try-catch-finally
 */
public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

//        int k = i / j;                      // ArithmeticException 발생. 프로그램 종료
//        System.out.println(k);              // 여기부터는 실행되지 않음
//        System.out.println("main end!!");

        /**
         * try { ... }
         * : 수행할 코드. 예외 발생 가능성이 있는 블록
         */
        try {
            int k = i / j;
            System.out.println(k);
        }
        /**
         * catch(예외클래스 변수명) { ... }
         * : 예외 처리 블록
         * try블록에서 여러 종류의 Exception이 발생한다면, catch블록을 여러 개 둘 수 있다.
         * 예외클래스에 Exception클래스를 넣으면, 하나의 catch블록에서 모든 오류를 처리할 수 있다.
         */
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. " + e.toString());   // 오류 정보 출력
        }
        /**
         * finally { ... }
         * : 예외 발생 여부에 상관없이 반드시 실행되는 블록 (생략 가능)
         */
        finally {
            System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
        }

        System.out.println("main end!!");
    }
}
