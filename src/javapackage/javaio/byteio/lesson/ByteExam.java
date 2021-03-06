package javapackage.javaio.byteio.lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일로부터 1 byte씩 읽어들여, 파일에 1 byte씩 저장하는 프로그램
public class ByteExam {
    public static void main(String[] args) {

        // 시작시간 체크
        // System.currentTimeMillis(): 현재 시간을 Long 타입으로 반환
        long startTime = System.currentTimeMillis();

        // 파일로부터 읽어들이는 객체
        FileInputStream fis = null;

        // 파일에 쓸 수 있는 객체
        FileOutputStream fos = null;

        // 파일이 없을 경우에 발생할 수 있는 exception을 발생시키기 때문에, exception 처리를 해주어야한다.
        try {

            // 읽을 파일의 경로를 넣는다. 기본 경로는 "프로젝트명/" 이다.
            fis = new FileInputStream("src/javapackage/javaio/byteio/lesson/ByteExam.java");

            // 쓰고 싶은 위치를 넣는다. 기본 경로는 "프로젝트명/" 이다.
            fos = new FileOutputStream("src/javapackage/javaio/byteio/lesson/byte.txt");

            // 읽어들였을 때 값을 담는 변수
            int readData = -1;

            /**
             * FileInputStream의 read() 메서드
             * - 1 byte씩 읽는다.
             * - 정수를 리턴한다.
             *   정수의 4 byte 중 마지막 byte에 읽어들인 1 byte를 저장한다.
             *   byte를 리턴한다면, 끝을 나타내는 값을 표현할 수 없기 때문에, byte가 아닌 int를 리턴한다.
             * - 더이상 읽어들일 것이 없을 때, -1을 리턴한다.
             *
             * 파일을 읽어들이는 부분
             * - 읽어 들일 코드가 여러 줄이 있을 수 있기 때문에, 반복문을 통해 읽어준다.
             * - 1 byte씩를 읽어서 readData에 담아준다.
             */
            while ((readData = fis.read()) != -1) {     // 파일이 끝날 때까지 반복

                /**
                 * FileOutputStream의 write() 메서드
                 * : 읽어들인 값을 파일에 쓴다.
                 */
                fos.write(readData);
            }

        } catch (Exception e) {     // 다른 exception도 발생할 수 있기 때문에 Exception으로 받아들인다.
            e.printStackTrace();
        } finally {

            /**
             * fis와 fos를 사용하고 나면, close 해야 한다.
             * close() 메서드가 IOException을 발생시키므로, exception 처리를 해줘야 한다.
             */
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 종료시간 체크
        long endTime = System.currentTimeMillis();

        // 수행시간 계산
        System.out.println(endTime - startTime);    // 78 출력
    }
}
