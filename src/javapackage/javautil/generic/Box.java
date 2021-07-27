package javapackage.javautil.generic;

/**
 * Generic
 * : 인스턴스를 만들 때 사용하는 타입을 지정하는 문법
 *
 * Generic 사용방법
 * : 클래스 이름 뒤에 가상의 타입 <E>를 넣고, Object 부분을 E로 변경한다.
 * "Box는 가상의 클래스 E를 사용한다"라는 의미
 *
 * 선언할 때는 가상의 타입으로 선언하고,
 * 실제 사용할 때는 구체적으로 타입들을 설정해서,
 * 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있다.
 *
 * Generic을 사용하는 대표적인 클래스
 * : 컬렉션 프레임워크와 관련된 클래스들
 */
//public class Box {
//    private Object obj;
//
//    public Object getObj() {
//        return obj;
//    }
//
//    // Object 뿐만 아니라, Object를 상속받은 모든 클래스가 들어올 수 있다.
//    public void setObj(Object obj) {
//        this.obj = obj;
//    }
//}

public class Box<E> {
    private E obj;

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
