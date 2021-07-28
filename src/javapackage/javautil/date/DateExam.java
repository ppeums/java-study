package javapackage.javautil.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {

        // 현재 시간과 날짜 정보를 Date 인스턴스가 가진다.
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date);

        // 내가 원하는 형식으로 Date 출력
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));

        // 현재 시간(date가 생성된 시간)을 Long 타입으로 표현
        System.out.println(date.getTime());

        // 시스템의 현재 시간을 Long 값으로 구한다.
        long today = System.currentTimeMillis();
        System.out.println(today);

        // date가 생성된 시간부터 지금까지 코드 사이에 걸린 시간
        System.out.println(today - date.getTime());
    }
}
