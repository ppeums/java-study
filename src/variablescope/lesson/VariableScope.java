package variablescope.lesson;

public class VariableScope {
    int globalScope = 10;       // 사용범위 = 클래스 전체
    static int staticVal = 7;

    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {

        // static 한 메서드에서는 static 하지 않은 필드를 사용할 수 없다.
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);

        // static 한 필드나, static 한 메서드는 Class가 인스턴스화 되지 않아도 사용할 수 있다.
        System.out.println(staticVal);

        // static 한 메서드에서 static 하지 않은 변수를 사용하려면, 객체를 생성하고 사용하면 된다.
        VariableScope v1 = new VariableScope();
        System.out.println(v1.globalScope);

        // 이 객체 안에 globalScope을 저장할 수 있는 공간을 별도로 가진다.
        VariableScope v2 = new VariableScope();

        /**
         * globalScope 같은 변수: 인스턴스가 생성될 때 생성된다.
         * "인스턴스 변수"라고 한다.
         */
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);         // 10 출력
        System.out.println(v2.globalScope);         // 20 출력

        /**
         * static 한 변수: 값을 저장할 수 있는 공간이 하나만 생성되므로 값을 공유한다.
         * "클래스 변수"라고 한다.
         * 인스턴스를 생성하지 않아도 사용할 수 있으므로, 클래스 이름을 직접 사용한다. (바람직한 방법)
         */
        v1.staticVal = 50;
        v2.staticVal = 100;

        System.out.println(v1.staticVal);               // 100 출력
        System.out.println(v2.staticVal);               // 100 출력
        System.out.println(VariableScope.staticVal);    // 100 출력
    }
}
