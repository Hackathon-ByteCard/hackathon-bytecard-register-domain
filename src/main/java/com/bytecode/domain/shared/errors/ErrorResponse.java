package com.bytecode.domain.shared.errors;

public class ErrorResponse {
    private String error;
    private String reason;
    private String message;

    public ErrorResponse(String error, String reason, String message) {
        this.error = error;
        this.reason = reason;
        this.message = message;
    }
}
