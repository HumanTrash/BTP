package art.str.btp.ms.spring.model.dto.api;

import org.joda.time.DateTime;

public class ApiResponse {
    private ApiOperationResultType resultType;
    private DateTime timeStamp;
    private String message;

    public ApiOperationResultType getResultType() {
        return resultType;
    }

    public void setResultType(ApiOperationResultType resultType) {
        this.resultType = resultType;
    }

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
