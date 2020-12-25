package com.flexapp.model.dao.exception;

public class ModelException extends Exception {

    /**
     * Constructor with specified string
     *
     * @param message string
     */
    public ModelException(String message) {
        super(message);
    }

    /**
     * Constructor with specified string and exception
     *
     * @param message string
     * @param e       error covered
     */
    public ModelException(String message, Throwable e) {
        super(message, e);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

}