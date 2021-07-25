package inheritance.overriding.lesson;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();

        // run 메서드를 오버라이드 했으므로, Bus의 run 메서드가 호출된다.
        bus.run();
        /*-
         * <결과>
         * Car의 run 메서드
         * Bus의 run 메서드
         */
    }
}
