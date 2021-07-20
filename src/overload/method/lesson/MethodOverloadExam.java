package overload.method.lesson;

public class MethodOverloadExam {
    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();

        // 메서드의 인자에 어떤 값이 쓰이느냐에 따라서 각각 다른 메서드가 호출된다.
        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4, 6, 7));
        System.out.println(m.plus("hello", "world"));
    }
}
