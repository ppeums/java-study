package thread.statecontrol.waitnotify;

// ThreadB를 사용하며 wait 하는 클래스
public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();

        // 스레드가 실행되면, 해당 스레드는 run() 메서드 안에서 자신의 모니터링 락을 획득
        b.start();

        /**
         * b에 대하여 동기화 블록을 설정
         * - b에 대한 동기화 블록이 ThreadB보다 먼저 실행되면,
         *   main 스레드는 wait를 하게 되면서 모니터링 락을 놓고 대기한다.
         */
        synchronized (b) {
            try {
                System.out.println("b가 완료될 때까지 기다립니다.");

                /**
                 * wait()
                 * - 해당 스레드는 해당 객체의 모니터링 락에 대한 권한을 놓고 대기한다.
                 * - 동기화된 블록 안에서 사용해야 한다.
                 * - 반드시 다른 스레드가 noitfy()를 호출해줘야만 깨어난다.
                 *
                 * -
                 * - b.wait() 메서드를 호출하면, main 스레드는 정지한다.
                 * - ThreadB가 값을 5번 더한 후, notify()를 호출하면, wait에서 깨어나게 된다.
                 */
                b.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 깨어난 후, 결과를 출력 (main이 자신의 일을 수행)
            System.out.println("Total is : " + b.total);
        }
    }
}
