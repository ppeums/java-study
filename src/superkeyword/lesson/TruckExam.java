package superkeyword.lesson;

public class TruckExam {
    public static void main(String[] args) {

        /**
         * 자신의 생성자만 실행되는 것이 아니라, 부모의 생성자부터 실행된다.
         * "내가 태어나기 위해서는 반드시 부모가 먼저 태어나야한다."
         */
        Truck t = new Truck();
        /*-
         * <결과>
         * Car의 기본 생성자 입니다.
         * Truck의 기본 생성자 입니다.
         */
    }
}
