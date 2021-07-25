package classandobject.overloading.method.lesson;

/**
 * 메서드 오버로딩
 * : 매개변수의 타입과 개수을 다르게 해서 같은 이름의 메서드를 여러 개 가질 수 있다.
 */
public class MethodOverload {
    public int plus(int x, int y) {
        return x + y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }

    // 매개변수의 변수명은 중요하지 않다. 타입과 개수가 중요하다.
//    public int plus(int i, int j) {
//        return i + j;
//    }
}
