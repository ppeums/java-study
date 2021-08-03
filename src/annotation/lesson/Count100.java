package annotation.lesson;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 어노테이션 정의
 *
 * @Retention(RetentionPolicy.RUNTIME)
 * : 어노테이션을 JVM 실행 시에 감지할 수 있도록 한다.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {
}
