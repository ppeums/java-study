package superkeyword.lesson;

public class Truck extends Car {
   public Truck() {

       /**
        * this: 자신을 가리키는 키워드
        * super: 부모를 가리키는 키워드
        * super(): 부모의 기본 생성자를 호출한다. 컴파일러가 자동으로 추가한다.
        * 부모의 생성자를 임의로 호출하지 않으면, 컴파일러가 자동으로 부모의 기본 생성자를 호출한다.
        */
//        super();

       /**
        * 부모 클래스에 기본 생성자가 없으므로, 반드시 프로그래머가 직접 부모의 생성자를 호출해줘야한다.
        * 부모의 생성자 중에 name을 받는 생성자만 존재하므로, name을 넣어서 부모의 생성자를 호출해야한다.
        */
       super("소방차");

       System.out.println("Truck의 기본 생성자 입니다.");
    }
}
