package Task1;

public class UncheckedException extends RuntimeException {
    private ExceptionEnum exception;

    public UncheckedException(final String message, final ExceptionEnum exception) {
        super(message);
        this.exception = exception;
    }

    public ExceptionEnum getException() {
        return exception;
    }

    public void setException(final ExceptionEnum exception) {
        this.exception = exception;
    }
}
