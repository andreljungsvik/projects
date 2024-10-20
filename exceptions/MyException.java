public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
