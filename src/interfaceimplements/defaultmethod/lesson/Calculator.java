package interfaceimplements.defaultmethod.lesson;

public interface Calculator {

    // 인터페이스에서 메서드를 구현하면 오류 발생
    public int plus(int i, int j);
    public int multiple(int i, int j);

    // default 키워드를 이용하여 인터페이스에서 메서드를 구현할 수 있다.
    default int exec(int i, int j) {
        return i + j;
    }

    // static 키워드를 이용하여 인터페이스에서 메서드를 구현할 수 있다.
    // 반드시 인터페이스명.메서드명() 형식으로만 호출해야한다.
    public static int exec2(int i, int j) {
        return i * j;
    }
}
