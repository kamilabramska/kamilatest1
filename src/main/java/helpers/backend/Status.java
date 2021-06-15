package helpers.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    @JsonProperty("status_message")
    private String statusMessage;
    @JsonProperty("status_code")
    private String statusCode;

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusMessage='" + statusMessage + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
