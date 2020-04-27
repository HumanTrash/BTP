package art.str.btp.ms.spring.db.exceptions;

public class RepositoryException extends RuntimeException {
    private static final long serialVersionUID = -637253203020788383L;

    RepositoryException(String errMessage) {
        super(errMessage);
    }

    RepositoryException(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}
