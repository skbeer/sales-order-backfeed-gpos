package com.monsanto.irdsoapservices.utils;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class StringUtils {

	public static boolean isNullOrEmpty(String str) {
		return (str==null) || (str.trim().length() == 0);
	}
}
