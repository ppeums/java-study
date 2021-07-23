package exceptionhandling.userdefinedexception.lesson;

// Unchecked Exception
public class BizException extends RuntimeException {

    // 생성자만 정의해주면 된다.
    // 문자열로 된 오류메시지를 부모의 생성자에게 보내는 생성자
    public BizException(String msg) {
        super(msg);
    }

    // 실제 발생한 exception을 부모의 생성자에게 보내는 생성자
    public BizException(Exception ex) {
        super(ex);
    }
}
