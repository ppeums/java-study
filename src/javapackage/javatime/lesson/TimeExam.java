package javapackage.javatime.lesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {

        // LocalDateTime 클래스를 이용해서 현재 날짜와 시간을 가진 객체 생성
        LocalDateTime timePoint = LocalDateTime.now();      // 현재 날짜와 시간을 구한다.
        System.out.println(timePoint);

        // LocalDate를 이용해서 원하는 날짜를 갖고 있는 객체 생성
        LocalDate ld = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld);                             // 2012-12-12 출력

        // LocalTime을 이용해서 원하는 시간을 갖고 있는 객체 생성
        LocalTime lt = LocalTime.of(17, 18);
        System.out.println(lt);                             // 17:18 출력

        LocalTime lt2 = LocalTime.parse("10:15:30");        // 문자열
        System.out.println(lt2);                            // 10:15:30 출력

        // 현재 날짜와 시간 정보를 getter 메서드를 이용하여 구하는 방법
        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);                        // 2021-07-28 출력

        // 월이 1부터 시작한다.
        System.out.println(timePoint.getMonthValue());      // 7 출력
        System.out.println(timePoint.getMonth());           // JULY 출력 (Month 타입)

        Month month = timePoint.getMonth();
        System.out.println(month.getValue());               // 7 출력
        System.out.println(timePoint.getHour());            // 17 출력
    }
}
