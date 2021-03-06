package javapackage.javaio.byteio.lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일로부터 512 byte씩 읽어들여, 파일에 512 byte씩 저장하는 프로그램
// 1 byte씩 읽을 때보다 훨씬 수행시간이 짧다.
public class ByteExam2 {
    public static void main(String[] args) {

        // 메서드가 시작된 시간 체크
        // System.currentTimeMillis(): 현재 시간을 Long 타입으로 반환
        long startTime = System.currentTimeMillis();

        // 파일로부터 읽어들이는 객체
        FileInputStream fis = null;

        // 파일에 쓸 수 있는 객체
        FileOutputStream fos = null;

        // 파일이 없을 경우에 발생할 수 있는 exception을 발생시키기 때문에, exception 처리를 해주어야한다.
        try {

            // 읽을 파일의 경로를 넣는다. 기본 경로는 "프로젝트명/" 이다.
            fis = new FileInputStream("src/javapackage/javaio/byteio/lesson/ByteExam2.java");

            // 쓰고 싶은 위치를 넣는다. 기본 경로는 "프로젝트명/" 이다.
            fos = new FileOutputStream("src/javapackage/javaio/byteio/lesson/byte2.txt");

            // 읽어들였을 때 값을 담는 변수
            int readCount = -1;

            // 512byte 만큼 읽어들이기 위해 byte 배열 사용
            byte[] buffer = new byte[512];

            /**
             * 파일을 읽어들이는 부분
             * - 읽어 들일 코드가 여러 줄이 있을 수 있기 때문에, 반복문을 통해 읽어준다.
             * - 최대 512 byte를 읽어서 readCount에 담아준다.
             */
            while ((readCount = fis.read(buffer)) != -1) {     // 파일이 끝날 때까지 반복

                // buffer의 0번째부터 시작해서 readCount만큼 쓴다.
                fos.write(buffer, 0, readCount);
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

        // 메서드가 끝난 시간 체크
        long endTime = System.currentTimeMillis();

        // 메서드를 수행하는 데 걸린 시간을 구한다.
        System.out.println(endTime - startTime);    // 3 출력
    }
}
