package innerclass.anonymousclass;

// 추상 클래스 Action을 상속받은 클래스 MyAction
public class MyAction extends Action {
    @Override
    public void exec() {
        System.out.println("exec");
    }
}
