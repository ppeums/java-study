package javapackage.javaio.chario.lesson;

import java.io.*;

/**
 * 파일에서 한 줄씩 입력받아서 파일에 출력
 * => 파일에서 읽어들이는 FileReader + 한 줄씩 읽어들이는 BufferedReader 클래스 이용
 */
public class CharIOFileExam {
    public static void main(String[] args) {

        // 파일로부터 한 줄 읽어들이는 부분
        // 읽어들이고 싶은 파일의 경로 지정 (현재경로 = 프로젝트)
        // FileReader가 FileNotFoundException을 발생시킨다.
//        BufferedReader br = new BufferedReader(new FileReader("src/javapackage/javaio/chario/lesson/CharIOFileExam.java"));

        // 선언 부분과 exception 처리 부분을 분리하는게 좋다.
        BufferedReader br = null;

        // 파일에 쓰는 클래스는 FileWriter이지만, PrintWriter를 이용하는게 편리하다.
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("src/javapackage/javaio/chario/lesson/CharIOFileExam.java"));

            // 파일에서 받아들이므로 FileWriter 객체도 사용
            // 하지만, PrintWriter가 발전해서 PrintWriter만 사용해도 된다.
            // 저장할 파일 경로 지정
            pw = new PrintWriter(new FileWriter("src/javapackage/javaio/chario/lesson/test.txt"));

            // 파일에 쓰는 부분
            // 한 줄 읽었을 때 저장할 변수
            String line = null;

            // 파일에 여러 줄이 있을 수 있기 때문에, 반복문 이용
            // 파일의 끝이면 null 리턴
            while ((line = br.readLine()) != null) {      // 파일의 끝이 나올 때까지 반복

                // 읽어들인 값을 파일에 쓰는 부분
                pw.println(line);
            }
        }
        // 나중에 다른 메서드를 사용할 때 여러 exception들이 발생할 수 있으므로, Exception으로 처리
        catch (Exception e) {
            e.printStackTrace();
        }
        // IO는 열어줬으면 항상 닫아줘야 한다.
        finally {
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
