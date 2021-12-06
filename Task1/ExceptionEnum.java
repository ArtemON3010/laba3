package Task1;

public enum ExceptionEnum {
    OK(200),
    ERROR1(400),
    ERROR2(500);

    private int code;

    ExceptionEnum(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
