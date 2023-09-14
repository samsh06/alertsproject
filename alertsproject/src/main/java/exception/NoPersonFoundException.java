package exception;

public class NoPersonFoundException extends RuntimeException {

    public NoPersonFoundException() {
        super("No person(s) found!");
    }

}
