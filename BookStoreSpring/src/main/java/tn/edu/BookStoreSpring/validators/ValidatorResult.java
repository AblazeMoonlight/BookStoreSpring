package tn.edu.BookStoreSpring.validators;


import tn.edu.BookStoreSpring.DOA.ErrorCode;

import java.util.ArrayList;
import java.util.List;

public class ValidatorResult {
    private boolean isValid;

    private List<String> errors;
    private List<String> warnings;
    private List<String> infos;

    private ErrorCode mainErrorCode;
    private String mainErrorMessage;

    ValidatorResult(boolean isValid) {
        this.isValid = isValid;
        this.errors = new ArrayList<>();
        this.warnings = new ArrayList<>();
        this.infos = new ArrayList<>();
    }

    ValidatorResult(boolean isValid, ErrorCode mainErrorCode, String mainErrorMessage) {
        this(isValid);
        this.mainErrorCode = mainErrorCode;
        this.mainErrorMessage = mainErrorMessage;
    }


    public void addError(String error){
        this.errors.add(error);
    }

    public void addWarning(String warning){
        this.warnings.add(warning);
    }

    public void addInfo(String info){
        this.infos.add(info);
    }

    public void setMainError(ErrorCode mainErrorCode, String mainErrorMessage) {
        this.mainErrorCode = mainErrorCode;
        this.mainErrorMessage = mainErrorMessage;
    }

    public boolean isValid() {
        return isValid;
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public List<String> getInfos() {
        return infos;
    }

    public ErrorCode getMainErrorCode() {
        return mainErrorCode;
    }

    public String getMainErrorMessage() {
        return mainErrorMessage;
    }

}