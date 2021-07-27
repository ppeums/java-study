package javapackage.javautil.map.lesson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        // Generic을 이용하여 Key, Value의 타입을 지정한다.
        // Key, Value가 모두 String 타입인 HashMap 인스턴스를 만든다.
        Map<String, String> map = new HashMap<>();

        // map에 데이터 저장
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");

        // 같은 key로 값이 또 들어오면, 기존에 있었던 값을 새로 들어온 값으로 바꾼다.
        map.put("001", "kang");                 // kim을 kang으로 바꾼다.

        // map에 저장된 자료의 수 출력
        System.out.println(map.size());         // 3 출력

        // key를 이용해서 값을 꺼낸다.
        System.out.println(map.get("001"));     // kang 출력
        System.out.println(map.get("002"));     // lee 출력
        System.out.println(map.get("003"));     // choi 출력

        // map이 가지고 있는 데이터를 모두 꺼내는 방법
        // map에 저장된 모든 key들을 Set 자료구조로 꺼낸다.
        Set<String> keys = map.keySet();
        // Set에 있는 key들을 꺼내기 위해 Iterator 사용
        Iterator<String> iter = keys.iterator();    // key가 String이므로
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
