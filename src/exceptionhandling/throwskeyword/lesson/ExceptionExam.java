package exceptionhandling.throwskeyword.lesson;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        // 메서드를 호출하는 쪽에서 오류를 처리해야한다.
//        int k = divide(i, j);
//        System.out.println(k);

        // 오류 처리 코드
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * throws
     * : 예외가 발생했을 때, 호출한 쪽에서 예외를 처리하도록 던져준다.
     * 메서드 내에서 수행하다가 발생한 오류를 메서드 내에서 처리하지 않고,
     * 메서드를 호출한 쪽에서 처리할 수 있도록 오류를 떠넘긴다.
     * ,로 여러 개의 오류를 넘길 수도 있고, Exception만 써서 모든 오류를 넘길 수도 있다.
     *
     * throws ArithmeticException
     * : "해당 오류는 divide를 호출한 쪽에서 처리해야합니다"라는 의미
     */
    public static int divide(int i, int j) throws ArithmeticException {

        // 여기서 오류 발생
        // 원래는 여기서 try블록으로 오류를 처리해야한다.
        int k = i / j;

        return k;
    }
}
