package thread.synchronization;

// 공유 객체 MusicBox
public class MusicBox {

    /**
     * 동기화 메서드
     * - 공유 객체가 가진 메서드가 동시에 호출되지 않도록 하는 방법
     * - 메서드의 리턴타입 앞에 synchronized를 붙인다.
     * - 여러 개의 Thread들이 공유 객체의 메서드를 사용할 때 메서드에 synchronized가 붙어있을 경우,
     *   먼저 호출된 메서드가 객체의 사용권(Monitoring Lock)을 얻는다.
     *   다른 스레드들은 모니터링 락을 놓을 때까지 대기한다.
     * - 실행해보면, 메서드 하나가 모두 실행된 후에 다음 메서드가 실행된다.
     *
     * 모니터링 락(Monitoring Lock)
     * - 객체의 사용권
     * - 메서드 실행이 종료되거나, wait()와 같은 메서드를 만나기 전까지 유지된다.
     */
    public synchronized void playMusicA() {

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

    public synchronized void playMusicB() {

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

    /**
     * synchronized를 붙이지 않은 메서드
     * - 다른 스레드들이 synchronized 메서드를 실행하면서 모니터링 락을 얻었더라도,
     *   그것과 상관없이 실행된다.
     */
    public void playMusicC() {

        // 1초 이하로 쉬면서 어떤 음악을 10번 반복 출력
        for (int i = 0; i < 10; i++) {

            /**
             * 동기화 블록
             * - 메서드의 코드가 길어지면, 마지막에 대기하는 스레드가 너무 오래 기다린다.
             * - 이를 막기 위해서, 메서드 전체에 synchronized를 붙이는 것이 아니라,
             *   동시에 실행되면 안 되는 부분에만 synchronized 블록을 사용한다.
             *
             * - 현재 객체가 모니터링 락을 가질 수 있을 경우,
             *   모니터링 락을 가지게 해서 동기화하도록 하겠다는 의미이다.
             * - playMusicA 메서드가 종료될 때 모니터링 락을 놓게되는데,
             *   synchronized 블록에서 대기하던 스레드는 이때 실행된다.
             * - 딱 한 줄만 블록으로 감싸져 있으므로, 그때만 모니터링 락을 가지고 실행한다.
             *   => 다른 스레드들이 조금 더 빠르게 진입할 수 있게 된다.
             */
            synchronized (this) {
                System.out.println("카페 음악!!!");     // 중복되면 안 되는 부분
            }

            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
