package exceptionhandling.throwkeyword.practice;

public class ExceptionExam {
    public int get50thItem(int[] array) {
        if (array.length < 50) {
            throw new IllegalArgumentException("배열 크기가 50보다 작으면 안됩니다.");
        }
        return array[49];
    }
}
