package thread.implementsrunnable.practice;

public class Bus extends Car implements Runnable {
    //이미 Car를 상속받은 상태이기 때문에 Thread를 상속받을 수는 없습니다.
    //Runnable인터페이스를 implements하고 run메소드를 작성해 보세요.
    @Override
    public void run() {
    }
}
