package thread.statecontrol.join;

public class MyThread extends Thread {
    @Override
    public void run() {

        // 0.5초씩 쉬면서 숫자를 출력한다.
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
