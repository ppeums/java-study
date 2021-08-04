package thread.implementsrunnable.lesson;

/**
 * 쓰레드를 만드는 방법 2
 * - Runnable 인터페이스를 구현해서 쓰레드를 만드는 방법
 * - 이미 다른 클래스를 상속받고 있을 때, Thread 클래스를 또 상속받을 수는 없기 때문
 */
public class MyThread2 implements Runnable {
    String str;

    // 문자열을 받아들이는 생성자 (방법 1과 동일)
    public MyThread2(String str) {
        this.str = str;
    }

    // Runnable 인터페이스가 가지고 있는 run() 메서드 구현 (방법 1과 동일)
    @Override
    public void run() {

        // 생성자에서 받아들인 문자열을 10번 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(str);

            // sleep()이 발생시키는 exception을 처리
            try {

                // Thread.sleep(): 밀리초 쉰다 (1초 = 1000)
                // Math.random(): 0.0 ~ 1.0 사이의 값 반환
                Thread.sleep((int) (Math.random() * 1000));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
