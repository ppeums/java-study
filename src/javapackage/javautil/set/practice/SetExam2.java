package javapackage.javautil.set.practice;

import java.util.*;

public class SetExam2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");

        Iterator<String> iter = set.iterator();
        //iter를 이용해서 set의 내용을 출력하세요.
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
