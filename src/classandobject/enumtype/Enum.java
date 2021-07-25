package classandobject.enumtype;

// 특정 값만 가져야 한다면 열거형(enum)을 사용하는 것이 좋다.
public class Enum {

    /**
     * 상수형
     * : 열거형 등장 이전에는 열거형 대신으로 사용했었다.
     * 전체 변수명을 대문자로 써야한다.
     */
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {

        // gender1은 MALE, FEMALE 둘 중 한가지 값만 가지길 원한다.
        String gender1;
        gender1 = Enum.MALE;        // static 한 필드는 클래스명으로 바로 접근할 수 있다.
        gender1 = Enum.FEMALE;

        // 문제점: MALE, FEMALE이 아닌 다른 값도 저장할 수 있다.
        // 컴파일 시점에는 문제가 없지만, 실행시키면 문제가 생길 수도 있다.
        gender1 = "boy";

        // 열거형 사용
        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // Gender 타입의 변수에는 MALE, FEMALE이 아닌 다른 값은 저장할 수 없다.
//        gender2 = "boy";
    }

    /**
     * 열거형 정의
     * enum 이름 { 값1, 값2; }
     */
    enum Gender {
        MALE, FEMALE;
    }
}
