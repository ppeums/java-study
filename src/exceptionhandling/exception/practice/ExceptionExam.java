package exceptionhandling.exception.practice;

public class ExceptionExam {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            array[20] = 5;
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            System.out.println("무조건 실행되는 블록입니다.");
        }
    }
}
