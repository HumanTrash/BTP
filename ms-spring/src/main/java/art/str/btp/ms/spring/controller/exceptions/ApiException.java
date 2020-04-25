package art.str.btp.ms.spring.controller.exceptions;

public class ApiException extends RuntimeException {
    public ApiException(String errMessage) {
        super(errMessage);
    }

    public ApiException(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}
