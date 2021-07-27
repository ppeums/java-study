package javapackage.javautil.generic;

public class BoxExam {
    public static void main(String[] args) {

        // Object 타입으로 받았기 때문에, 모든 객체가 다 들어갈 수 있다.
        // 하지만, 다시 꺼내서 사용할 때 매번 형변환을 해야한다.
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");                      // String 클래스는 Object를 상속받았으므로 들어올 수 있다.
////        box.getObj();                           // Object 타입으로 반환한다. 하지만 우리는 String 타입으로 값을 받고 싶다.
//        String str = (String) box.getObj();       // 형변환
//
//        box.setObj(1);
//        int value = (int) box.getObj();           // 형변환

        /**
         * Generic을 지정해서 Box를 사용한다.
         * 매번 형변환을 할 필요가 없다.
         */
        // Object를 사용하는 Box 인스턴스를 만든다.
        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        // String을 사용하는 Box 인스턴스를 만든다.
        Box<String> box2 = new Box<>();     // 이 Box 안에는 String 값만 받을 것이다.
        box2.setObj("hello");
//        box2.setObj(3);                   // 컴파일오류 발생. String만 받을 수 있다.
        String str = box2.getObj();         // 값을 String으로 반환한다. 형변환을 할 필요가 없다.

        // Integer를 사용하는 Box 인스턴스를 만든다.
        Box<Integer> box3 = new Box<>();
        box3.setObj(4);                     // 오토박싱
        int v2 = box3.getObj();             // 오토언박싱
    }
}
