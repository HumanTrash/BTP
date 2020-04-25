package art.str.btp.ms.spring.mapping.exceptions;

public class MappingException extends RuntimeException {

    public MappingException(String errMessage) {
        super(errMessage);
    }

    public MappingException(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}
