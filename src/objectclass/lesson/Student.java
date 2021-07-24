package objectclass.lesson;

import java.util.Objects;

/**
 * Object 클래스
 * : 모든 클래스의 최상위 클래스
 *   아무것도 상속받지 않으면, 자동으로 Object를 상속받는다.
 *   Object가 가지고 있는 메서드는 모든 클래스에서 다 사용할 수 있다.
 *
 * 가장 많이 사용되는 메서드
 * equals(): 객체가 가진 값을 비교
 * toString(): 객체가 가진 값을 문자열로 반환
 * hashCode(): 객체의 해시코드 값을 반환
 *
 * 이 메서드들은 반드시 오버라이딩 해서 사용해야한다.
 */
public class Student {
    String name;        // 이름
    String number;      // 학번
    int birthYear;      // 생년

    // 메서드의 파라미터로 들어온 Object와 자기자신 비교
    @Override
    public boolean equals(Object o) {

        // 참조가 같은 것을 의미하므로 같다.
        if (this == o) return true;

        // null이면 비교할 필요 없이 false이다.
        // 두 클래스 정보가 다르면 false이다. 서로 다른 클래스끼리는 값을 비교할 필요가 없기 때문이다.
        // getClass(): 클래스의 정보를 가지고 있다. 클래스라는 객체를 반환한다.
        if (o == null || getClass() != o.getClass()) return false;

        // Object를 Student로 형변환
        Student student = (Student) o;

        // 자신의 number와 Object의 number 비교
        return number.equals(student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    // Student 객체의 속성들 출력
    @Override
    public String toString() {

        // 문자열 수정 가능
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {

        // s1과 s2의 속성들이 동일하다.
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        // equals 메서드를 오버라이딩 하기 전에는 두 객체가 동일하지 않다고 출력된다.
        // 오버라이딩 하면, 두 객체의 number를 비교하므로 동일하다고 출력된다.
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        // hashCode 메서드를 오버라이딩 하기 전에는 두 객체의 해시코드가 서로 다른 값을 출력한다.
        // 오버라이딩 하면, 같은 값이 출력된다.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // toString 메서드를 오버라이딩 하기 전에는 의미 없는 값을 출력한다.
        // 오버라이딩 하면, Student 객체의 속성들을 출력한다.
        System.out.println(s1);

        // s1을 출력했을 때와 실행 결과가 동일하다.
        // 객체를 출력하면, 내부적으로 toString 메서드를 호출해서 출력한다는 것을 알 수 있다.
        System.out.println(s1.toString());
    }
}
