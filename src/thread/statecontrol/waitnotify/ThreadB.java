package thread.statecontrol.waitnotify;

// Thread를 상속 받는 ThreadB 클래스
public class ThreadB extends Thread {

    // 해당 스레드가 실행되면, 자기 자신의 모니터링 락을 획득한다.
    int total;

    public void run() {

        synchronized (this) {

            // 5번 반복하면서 0.5초씩 쉬면서 total에 값을 누적
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다.");
                total += i;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            /**
             * notify()
             * - wait 하고 있는 스레드를 깨운다.
             * - 동기화된 블록 안에서 사용해야 한다.
             */
            notify();
        }
    }
}
