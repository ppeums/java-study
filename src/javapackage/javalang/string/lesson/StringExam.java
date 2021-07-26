package javapackage.javalang.string.lesson;

/**
 * String 클래스
 * : 문자열을 다룰 때 사용하는 클래스. 불변 클래스.
 */
public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);       // str1은 변화 없음
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        // 문자열과 문자열을 더하면, 내부적으로는 이렇게 실행한다.
        // 항상 StringBuffer객체가 만들어진다.
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        // 문자열을 반복문 안에서 더하는 것은 성능상 문제가 생길 수 있으니 반드시 피해야한다.
        String str5 = "";
        // 100번 동안 내부적으로 StringBuffer객체를 만들어낸다.
        // Java는 new 연산자가 많이 사용될수록 프로그램의 속도가 느려진다.
        for (int i = 0; i < 100; i++) {
            str5 = str5 + "*";
        }
        System.out.println(str5);

        // 문자열의 +연산을 많이 사용할 때는, StringBuffer클래스를 이용하는 것이 더 효율적이다.
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}
