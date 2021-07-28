package javapackage.javautil.calendar.lesson;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {

        /**
         * Calendar 클래스 생성 방법
         * - Calendar는 추상 클래스이므로, 직접 인스턴스를 생성할 수 없다.
         * - Calendar가 가지고 있는 클래스 메서드 getInstance()를 사용해야한다.
         */
        Calendar cal = Calendar.getInstance();

        /**
         * Calendar 클래스를 이용해서 현재 날짜와 시간에 대한 정보를 알아내는 방법
         * - Calendar는 현재 날짜와 시간에 대한 정보를 가진다.
         * - Calendar가 가지고 있는 get 메서드를 사용해서 원하는 정보를 추출한다.
         * - Calendar가 제공하는 상수를 넣어서 값을 꺼낸다.
         *   상수를 사용할 때는 클래스명.상수명으로 사용해야한다.
         */
        System.out.println(cal.get(Calendar.YEAR));         // 연도
        System.out.println(cal.get(Calendar.MONTH) + 1);    // 월은 0부터 시작
        System.out.println(cal.get(Calendar.DATE));         // 일

        System.out.println(cal.get(Calendar.HOUR));         // 시간
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));  // 시간 (24시간 형식)
        System.out.println(cal.get(Calendar.MINUTE));       // 분
        System.out.println(cal.get(Calendar.SECOND));       // 초

        // Calendar가 가지고 있는 add 메서드를 이용하면, 다음 날짜나 이전 날짜를 구할 수 있다.
        cal.add(Calendar.HOUR, 5);      // 5시간 이후

        System.out.println(cal.get(Calendar.YEAR));         // 연도
        System.out.println(cal.get(Calendar.MONTH) + 1);    // 월은 0부터 시작
        System.out.println(cal.get(Calendar.DATE));         // 일

        System.out.println(cal.get(Calendar.HOUR));         // 시간
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));  // 시간 (24시간 형식)
        System.out.println(cal.get(Calendar.MINUTE));       // 분
        System.out.println(cal.get(Calendar.SECOND));       // 초
    }
}
