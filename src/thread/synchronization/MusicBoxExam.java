package thread.synchronization;

// MusicBox와 MusicPlayer를 사용하는 클래스
public class MusicBoxExam {
    public static void main(String[] args) {

        // MusicBox가 1개 있다.
        MusicBox box = new MusicBox();

        // MusicBox를 이용하는 MusicPlayer가 3명 있다.
        MusicPlayer kang = new MusicPlayer(1, box);
        MusicPlayer kim = new MusicPlayer(2, box);
        MusicPlayer lee = new MusicPlayer(3, box);

        // 각각의 MusicPlayer 스레드를 실행한다.
        kang.start();
        kim.start();
        lee.start();
    }
}
