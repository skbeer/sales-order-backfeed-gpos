package com.monsanto.commercial.growercreditlist.exception;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 27, 2012
 * Time: 2:37:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResponseParserException extends ServiceException {
    public ResponseParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResponseParserException(String message) {
        super(message);
    }
}
