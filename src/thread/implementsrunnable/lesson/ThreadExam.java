package thread.implementsrunnable.lesson;

// 실행결과는 방법 1과 동일
public class ThreadExam {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        /**
         * MyThread2는 Thread를 상속받지 않았기 때문에, Thread가 아니다.
         * - start()를 사용할 수 없다.
         * - run() 밖에 없다.
         */
//        t1.start();
//        t2.start();

        /**
         * Thread의 생성자에 MyThread2를 넣어서 Thread를 생성한다.
         * - Thread의 생성자는 Runnable을 받을 수 있다.
         */
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        // Thread 클래스가 가진 start() 메서드를 호출
        thread1.start();
        thread2.start();

        System.out.println("main end !!!");
    }
}
