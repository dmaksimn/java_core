package com.raman.lis.task03.shafalovich.exceptions;

public class CarCreateException extends Exception {
    public CarCreateException() {
    }

    public CarCreateException(String message) {
        super(message);
    }

    public CarCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarCreateException(Throwable cause) {
        super(cause);
    }

    public CarCreateException(String message, Throwable cause,
                              boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
