package exceptionhandling.throwkeyword.lesson;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

//        int k = divide(i, j);
//        System.out.println(k);

        // 메서드를 호출하는 쪽에서 오류를 처리한다.
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    // throws IllegalArgumentException
    // : "해당 오류는 divide를 호출한 쪽에서 처리해야한다"는 의미
    public static int divide(int i, int j) throws IllegalArgumentException {

        // 나누기를 하기 전에 2번째 매개변수를 체크한다.
        if (j == 0) {

            // 오류 메시지를 출력하고 0을 리턴한다.
            // 하지만 0으로 나눈 결과는 0이 아니므로, 잘못된 값을 반환하면 더 큰 문제가 발생할 수 있다.
//            System.out.println("2번째 매개변수는 0이면 안됩니다.");
//            return 0;

            /**
             * 오류를 직접 발생시킨다.
             * new를 통해 IllegalArgumentException 객체가 만들어진다.
             * exception이 발생했으므로 메서드를 호출하는 쪽에서 처리해야한다.
             *
             * throw
             * : 해당 라인에서 exception이 발생한다는 의미
             *
             * IllegalArgumentException
             * : argument가 잘못되었기 때문에 발생한 오류
             */
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        return k;
    }
}
