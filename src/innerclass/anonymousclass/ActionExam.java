package innerclass.anonymousclass;

public class ActionExam {
    public static void main(String[] args) {

        // Action을 상속받은 클래스 MyAction 사용
//        Action action = new MyAction();
//        action.exec();

        /**
         * Action을 상속받는 익명 클래스를 만들어서 사용
         *
         * 익명 클래스를 만드는 이유
         * : Action을 상속받는 클래스를 만들 필요가 없을 경우
         *   Action을 상속받는 클래스가 해당 클래스 안에서만 사용되고 다른 클래스에서는 사용되지 않는 경우
         */
        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };

        // 해당 메서드 호출
        action.exec();
    }
}
