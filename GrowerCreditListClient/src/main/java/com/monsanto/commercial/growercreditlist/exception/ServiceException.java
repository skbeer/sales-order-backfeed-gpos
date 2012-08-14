package com.monsanto.commercial.growercreditlist.exception;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 27, 2012
 * Time: 2:35:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceException extends Exception {
    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
