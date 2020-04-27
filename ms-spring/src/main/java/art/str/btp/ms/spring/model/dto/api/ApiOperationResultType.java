package art.str.btp.ms.spring.model.dto.api;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ApiOperationResultType {
    SUCCESSFUL("successful"),
    PARTLY("partly"),
    FAILED("failed");

    private String operationResult;

    ApiOperationResultType(String operationResult) {
        this.operationResult = operationResult;
    }

    @JsonValue
    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }
}
