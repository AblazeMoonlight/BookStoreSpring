package tn.edu.BookStoreSpring.DOA;

public enum ErrorCode {
    FIELD_MISSING_DATA("0001"),
    FIELD_INVALID_DATA("0002"),
    FIELD_DUPLICATE_VALUE("0003"),

    INVALID_PARAM("0010")

    ;

    private String code;
    ErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
