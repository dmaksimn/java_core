package com.raman.lis.task03.shafalovich.exceptions;

public class WheelException extends Exception {
    public WheelException() {
    }

    public WheelException(String message) {
        super(message);
    }

    public WheelException(String message, Throwable cause) {
        super(message, cause);
    }

    public WheelException(Throwable cause) {
        super(cause);
    }

    public WheelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
