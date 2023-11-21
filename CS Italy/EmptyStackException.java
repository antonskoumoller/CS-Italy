public class EmptyStackException extends RuntimeException {
    public EmptyStackException() {

    }

    public EmptyStackException(String err) {
        super(err);
    }
}