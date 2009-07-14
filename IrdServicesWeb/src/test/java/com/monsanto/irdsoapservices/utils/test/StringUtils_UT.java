package com.monsanto.irdsoapservices.utils.test;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;

import javax.xml.namespace.QName;
import java.util.Calendar;
import java.net.URL;

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
