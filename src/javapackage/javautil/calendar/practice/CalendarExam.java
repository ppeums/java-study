package javapackage.javautil.calendar.practice;

import java.util.*;

public class CalendarExam {
    public String hundredDaysAfter() {
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        return year + "년" + month + "월" + date + "일";
    }

    public static void main(String[] args) {
    }
}
