package com.monsanto.irdsoapservices.utils.test;

import com.monsanto.irdsoapservices.utils.StringUtils;
import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 20, 2009
 * Time: 10:52:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringUtils_UT extends TestCase {

    public void testIsNUllOrEmpty() throws Exception {
        assertTrue(StringUtils.isNullOrEmpty(" "));
        assertTrue(StringUtils.isNullOrEmpty(""));
        assertTrue(StringUtils.isNullOrEmpty(null));
        assertFalse(StringUtils.isNullOrEmpty(" some   "));
    }

}
