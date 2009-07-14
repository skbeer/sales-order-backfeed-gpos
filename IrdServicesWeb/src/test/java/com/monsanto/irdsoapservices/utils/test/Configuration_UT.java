package com.monsanto.irdsoapservices.utils.test;

import com.monsanto.irdsoapservices.utils.Configuration;
import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class Configuration_UT extends TestCase {

    public void testConfiguration_readProperty_forWin() throws Exception {
		System.setProperty("lsi.function", "win");
		assertEquals("mkuchip@monsanto.com", Configuration.getInstance().getProperty(Configuration.ERROR_TO_EMAIL_ADDRESS));
	}

	public void testConfiguration_readProperty_forDifferentEnv() throws Exception {
		System.setProperty("lsi.function", "prod");
		assertEquals("NA1000MB-GCSTEAM@monsanto.com", Configuration.getInstance().getProperty(Configuration.ERROR_TO_EMAIL_ADDRESS));
		System.setProperty("lsi.function", "win");
	}

	public void testConfiguration_noPrefix_throwError() throws Exception {
		System.setProperty("lsi.function", "");
		try {
		Configuration.getInstance().getProperty(Configuration.ERROR_TO_EMAIL_ADDRESS);
		fail("Exception should occur");
		}catch(Exception r) {
		}
	}

	public void testConfiguration_invalidKey_throwException() throws Exception {
		try {
			Configuration.getInstance().getProperty("somekey");
			fail("Exception should occur");
			}catch(Exception r) {
			}
	}
	

}
