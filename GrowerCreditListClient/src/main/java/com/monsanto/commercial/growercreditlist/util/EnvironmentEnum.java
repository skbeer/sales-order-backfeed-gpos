package com.monsanto.commercial.growercreditlist.util;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Oct 5, 2011
 * Time: 11:14:00 AM
 * To change this template use File | Settings | File Templates.
 */
public enum EnvironmentEnum {
    DEV,
    DEV_INT,
    IT,
    IT_INT,
    PS,
    PS_INT,
    PROD,
    PROD_INT;

    public static EnvironmentEnum fromValue(String value) {
        return valueOf(value);
    }
}
