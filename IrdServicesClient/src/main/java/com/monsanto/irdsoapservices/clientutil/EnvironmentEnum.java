package com.monsanto.irdsoapservices.clientutil;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Apr 22, 2009
 * Time: 2:11:55 PM
 * To change this template use File | Settings | File Templates.
 */
public enum EnvironmentEnum {
    DEV_EXT,
    DEV_INT,
    IT_EXT,
    IT_INT,
    PS_EXT,
    PS_INT,
    PROD_EXT,
    PROD_INT;

    public static EnvironmentEnum fromValue(String value) {
        return valueOf(value);
    }

    public String toString() {
        return name();
    }
}
