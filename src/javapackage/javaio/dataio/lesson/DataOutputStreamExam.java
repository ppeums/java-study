package javapackage.javaio.dataio.lesson;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 다양한 타입을 파일에 저장하는 클래스
 * => 다양한 타입을 저장할 수 있는 DataOutputStream 클래스 + 파일에 쓰는 FileOutputStream 클래스 사용
 */
public class DataOutputStreamExam {
    public static void main(String[] args) {

        /**
         * try-with-resources
         * - 사용한 자원을 자동으로 종료시켜주는 기능
         * - try() 안에 선언한 IO객체는 별도로 close() 하지 않아도 된다.
         */
        try (
                /**
                 * IO객체 선언
                 *
                 * DataOutputStream
                 * - 다양한 타입으로 저장할 수 있는 클래스
                 * - 생성자가 OutputStream을 매개변수로 받아들인다.
                 * - 읽어낼 때, DataInputStream을 이용해서 읽어내야 한다.
                 */
                // 저장할 파일의 경로 지정
                DataOutputStream out = new DataOutputStream(new FileOutputStream("src/javapackage/javaio/dataio/lesson/data.txt"));
        ) {
            /**
             * IO객체 사용
             *
             * DataOutputStream은 write() 메서드를 다양한 형식으로 오버로딩 하고 있다.
             *
             * writeInt(): 정수값(4 byte)으로 저장한다
             * writeBoolean(): boolean 값(1 byte)으로 저장한다.
             * writeDouble(): double 값(8 byte)으로 저장한다.
             */
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
