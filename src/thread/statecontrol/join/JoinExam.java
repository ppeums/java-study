package thread.statecontrol.join;

public class JoinExam {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        // main 스레드는 이미 종료되었고, 그동안 thread는 준비를 마치고 출력한다.
//        System.out.println("시작");
//        System.out.println("종료!");

        /**
         * join() 메서드
         * - 스레드가 멈출 때까지 기다리게 한다.
         * - main 스레드가 먼저 종료되지 않고, MyThread가 모두 끝날 때까지 기다려준다.
         */
        System.out.println("시작");

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료!");
    }
}
