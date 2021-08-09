package thread.synchronization;

// MusicBox를 가지는 Thread 객체 MusicPlayer
public class MusicPlayer extends Thread {
    int type;               // music의 타입
    MusicBox musicBox;      // MusicBox를 가질 수 있다.

    // type과 musicBox를 받아들이는 생성자
    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    // Thread의 run() 메서드를 오버라이딩
    @Override
    public void run() {

        // type에 따라 다른 음악을 재생한다.
        switch (type) {
            case 1:
                musicBox.playMusicA();
                break;
            case 2:
                musicBox.playMusicB();
                break;
            case 3:
                musicBox.playMusicC();
                break;
        }
    }
}
