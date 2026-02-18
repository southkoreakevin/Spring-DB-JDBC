package hello.jdbc.exception.basic;

public class UncheckedTest {

    static class MyUncheckedException extends RuntimeException{

        public MyUncheckedException(String message) {
            super(message);
        }
    }

    static class Repository{
        public void call(){
            throw new MyUncheckedException("ex");
        }
    }

    static class Service{

    }

}
