package art.str.btp.ms.spring.mapping.exceptions;

public class MappingException extends RuntimeException {
    private static final long serialVersionUID = -1178165500958728334L;

    public MappingException(String errMessage) {
        super(errMessage);
    }

    public MappingException(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}
