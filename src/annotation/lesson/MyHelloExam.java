package annotation.lesson;

import java.lang.reflect.Method;

// MyHello를 사용하는 클래스
public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

//        Method method = hello.getClass().getDeclaredMethod("hello");

        /**
         * getClass()
         * : 해당 인스턴스를 만들 때 사용한 클래스의 정보를 리턴한다.
         *
         * getDeclaredMethod()
         * : 클래스의 정보로부터 hello라는 이름의 메서드에 대한 정보를 구한다.
         *   exception을 처리해야 한다.
         *
         * method
         * : hello에 대한 정보를 가지고 있다.
         */
        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            /**
             * isAnnotationPresent()
             * : 특정 어노테이션이 메서드에 적용되어있는가?
             *
             * method가 Count100 어노테이션을 적용하고 있는가?
             * - true면, hello() 메서드 100번 호출
             * - false면, hello() 메서드 1번 호출
             */
            if (method.isAnnotationPresent(Count100.class)) {

                // Count100 어노테이션이 적용되어있기 때문에, 이 부분이 실행된다.
                for (int i = 0; i < 100; i++) {
                    hello.hello();
                }
            } else {
                hello.hello();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
