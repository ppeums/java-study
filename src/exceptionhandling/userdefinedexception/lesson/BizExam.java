package exceptionhandling.userdefinedexception.lesson;

public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);

        // RuntimeException을 상속받은 메서드를 throw하고 있기 때문에 컴파일 시에는 오류가 없다.
//        biz.bizMethod(-3);      // exception 발생

        try {
            biz.bizMethod(-3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
