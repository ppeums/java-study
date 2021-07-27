package javapackage.javautil.set.lesson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {

        // Generic을 이용하여 String 값만 다루는 Set
        // Set은 인터페이스이므로 객체를 생성할 수 없다.
        // Set을 구현한 HashSet 클래스를 이용해서 인스턴스를 만든다.
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang");       // 저장할 때마다 boolean 값 반환
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");       // set에 이미 같은 값이 있으면 false 반환

        System.out.println(set1.size());        // 3개를 저장했지만, 중복된 값이 있기 때문에 2 출력

        System.out.println(flag1);              // true 출력
        System.out.println(flag2);              // true 출력
        System.out.println(flag3);              // false 출력

        // Set에 들어있는 값들을 하나씩 출력
        // Iterator 인터페이스를 이용해야한다.
        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {            // set에 데이터가 있는 동안 반복
            String str = iter.next();       // 값을 꺼낸다. 하나를 꺼내면, 자동으로 다음 것을 참조한다.
            System.out.println(str);
        }
    }
}
