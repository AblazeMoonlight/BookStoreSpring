package tn.edu.BookStoreSpring.DOA;

import tn.edu.BookStoreSpring.DOA.DAO;
import tn.edu.BookStoreSpring.DOA.ErrorCode;

import java.util.List;

public class ErrorData extends DAO {
    private String code;
    private String message;
    private String detailedMessage;

    private List<String> errors;

    public ErrorData() {

    }

    public ErrorData(ErrorCode code, String message) {
        this.code = code.getCode();
        this.message = message;
    }

    public ErrorData(ErrorCode code, String message, String detailedMessage) {
        this.code = code.getCode();
        this.message = message;
        this.detailedMessage = detailedMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code.getCode();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
