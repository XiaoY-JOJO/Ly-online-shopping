package com.leyou.myexception;

/**
 * @Author: xy
 * @Feature:
 */
public class MyException extends RuntimeException {

    public MyException(LyException exception) {
        super(exception.toString());
    }
}
