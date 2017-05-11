package com.muhlenxi;

/**
 * Created by yangxi on 2017/5/11.
 */
public class BookNotExistException extends Exception {
    public BookNotExistException() {
    }

    public BookNotExistException(String message) {
        super(message);
    }
}
