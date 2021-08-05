package thread.sharedobject;

// 공유 객체 MusicBox
public class MusicBox {
    public void playMusicA() {

        // 1초 이하로 쉬면서 어떤 음악을 10번 반복 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("신나는 음악!!!");

            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicB() {

        // 1초 이하로 쉬면서 어떤 음악을 10번 반복 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("슬픈 음악!!!");

            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC() {

        // 1초 이하로 쉬면서 어떤 음악을 10번 반복 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("카페 음악!!!");

            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
