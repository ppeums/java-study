package thread.extendsthread;

// MyThread를 사용하는 클래스
public class ThreadExam {

    /**
     * main 쓰레드 (또는 main 흐름)
     * - main 쓰레드가 종료되어도, 프로그램이 종료되는 것은 아니다.
     * - 모든 쓰레드가 종료되어야만, 프로그램이 종료된다.
     */
   public static void main(String[] args) {

        // 생성자에서 문자열을 받는다.
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        /**
         * Thread를 동작시킬 때, run()이 아닌 start()를 호출해야 한다.
         *
         * start()
         * - Thread가 실행할 준비를 하게 해주는 메서드
         * - Thread가 실행할 준비가 다 되면, run()을 호출해준다.
         *
         * t1.start()를 실행할 때, 프로그램의 흐름이 2개가 된다.
         * - 1) 원래 main()을 수행하던 흐름
         * - 2) 쓰레드가 하나 더 발생돼서, 그 run()이 실행되는 흐름
         *
         * t2.start()를 실행할 때, 프로그램의 흐름이 3개가 된다.
         * - 1) 원래 main()을 수행하던 흐름
         * - 2) 쓰레드 1의 run()이 실행되는 흐름
         * - 3) 쓰레드 2의 run()이 실행되는 흐름
         */
        t1.start();
        t2.start();

        System.out.println("main end !!!");
    }
}
