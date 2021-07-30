package javapackage.javaio.dataio.lesson;

import java.io.DataInputStream;
import java.io.FileInputStream;

// data.dat로부터 값을 읽어들여 화면에 출력하는 클래스
public class DataInputStreamExam {
    public static void main(String[] args) {

        // try-with-resources 구문 이용
        try (
                /**
                 * DataInputStream
                 * : 다양한 타입의 데이터를 읽어낼 수 있는 클래스
                 */
                // 읽어들일 파일의 경로 지정
                DataInputStream in = new DataInputStream(new FileInputStream("src/javapackage/javaio/dataio/lesson/data.txt"));
        ) {
            /**
             * DataInputStream의 readXXX() 메서드
             *
             * readInt(): 정수값을 읽어들인다.
             * readBoolean(): boolean 값을 읽어들인다.
             * readDouble(): double 값을 읽어들인다.
             *
             * 파일에 저장된 순서대로 읽어들여야 한다!!
             */
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            // 읽어낸 값 출력
            System.out.println(i);      // 100 출력
            System.out.println(b);      // true 출력
            System.out.println(d);      // 50.5 출력

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
