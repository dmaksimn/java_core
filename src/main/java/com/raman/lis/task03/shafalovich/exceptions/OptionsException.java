package com.raman.lis.task03.shafalovich.exceptions;

public class OptionsException extends Exception {
    public OptionsException() {
    }

    public OptionsException(String message) {
        super(message);
    }

    public OptionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public OptionsException(Throwable cause) {
        super(cause);
    }

    public OptionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
