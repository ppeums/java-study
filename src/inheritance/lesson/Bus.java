package inheritance.lesson;

// Car class를 상속받았다.
public class Bus extends Car {

    /**
     * "확장하였다"
     * : 부모가 가지고 있는 메서드 외에 추가로 메서드를 선언하는 것
     * Bus는 Car에서 물려받은 run 메서드와 ppangppang 메서드를 사용할 수 있게 된다.
     */
    public void ppangppang() {
        System.out.println("빵빵");
    }
}
