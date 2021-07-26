package javapackage.javalang.stringbuffer.lesson;

/**
 * String 클래스
 * : 자기자신이 변하지 않는 불변 클래스
 *
 * StringBuffer 클래스
 * : 자기자신이 변하는 클래스
 * StringBuffer가 가지고 있는 메서드들은 대부분 자기자신(this)을 반환한다.
 *
 * 메서드 체이닝
 * : 자기자신의 메서드를 호출하여 자기자신의 값을 바꿔나가는 것
 */
public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if (sb2 == sb3) {
            System.out.println("sb2 == sb3");
        }

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }
}
