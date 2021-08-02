package javapackage.javaio.chario.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 키보드로부터 한 줄 입력받아서 콘솔에 출력
public class CharIOConsoleExam {
    public static void main(String[] args) {

        /**
         * 키보드로부터 한 줄씩 입력받을 수 있는 부분
         *
         * System.in
         * : 키보드를 의미한다.
         *   InputStream 타입이다.
         *
         * BufferedReader
         * : 한 줄씩 입력받기 위한 클래스
         *   InputStream을 입력받는 생성자가 없다.
         *
         * - System.in은 InputStream 타입이므로, BufferedReader의 생성자에 바로 들어갈 수 없다.
         * - InputStream을 Reader 타입으로 바꿔줄 수 있는 InputStreamReader 클래스를 이용해야 한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // try 블럭 밖에서 선언하면, 밖에서도 line 변수를 사용할 수 있다.
        String line = null;

        // 키보드로부터 입력받은 문자열을 line 변수에 저장
        // readLine() 메서드가 IOException을 발생시키므로, 사용자가 처리해주어야 한다.
//        String line = br.readLine();

        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 입력받은 한 줄을 콘솔에 출력
        System.out.println(line);

        // 반복문을 이용해서 여러 줄을 입력받을 수도 있다.
        // 데코레이터 패턴을 이용해서 키보드가 아니라 파일로부터 입력받을 수도 있다.
        // 입력받았던 부분을 콘솔이 아니라 파일이나 다른 자료구조를 통해 저장할 수도 있다.
    }
}
