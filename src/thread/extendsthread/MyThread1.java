package thread.extendsthread;

/**
 * 쓰레드를 만드는 방법 1
 * - Thread 클래스를 상속받아서 쓰레드를 생성하는 방법
 */
public class MyThread1 extends Thread {
    String str;

    // 문자열을 받아들이는 생성자
    public MyThread1(String str) {
        this.str = str;
    }

    /**
     * Thread의 run() 메서드를 오버라이딩
     *
     * run()
     * - main() 메서드와 비슷하지만, 다른 흐름의 main() 메서드이다.
     * - 쓰레드 안에서 하고 싶은 일을 구현하면 된다.
     */
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
