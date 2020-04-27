package art.str.btp.ms.spring.controller.exceptions;

public class ApiException extends RuntimeException {
    private static final long serialVersionUID = -6182157557350430236L;

    public ApiException(String errMessage) {
        super(errMessage);
    }

    public ApiException(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}
