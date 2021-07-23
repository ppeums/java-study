package exceptionhandling.userdefinedexception.lesson;

public class BizService {

    // BizException을 넘겨준다.
    public void bizMethod(int i) throws BizException {
        System.out.println("비즈니스 메서드 시작");

        if (i < 0) {

            // BizException을 발생시키고, BizException에 오류메시지를 넘겨준다.
            throw new BizException("매개변수 i는 0 이상이어야 합니다.");
        }

        System.out.println("비즈니스 메서드 종료");
    }
}
