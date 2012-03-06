package com.monsanto.irdsoapservices.utils.test;

import com.monsanto.irdsoapservices.utils.Configuration;
import junit.framework.TestCase;
import org.apache.xerces.impl.xpath.regex.RegularExpression;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class Configuration_UT extends TestCase {

    public void testConfiguration_readProperty_forWin() throws Exception {
		System.setProperty("lsi.function", "win");
		assertEquals("caggarw@monsanto.com", Configuration.getInstance().getProperty(Configuration.ERROR_TO_EMAIL_ADDRESS));
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

    public void test() throws Exception {
        //String regEx = "\\(?(\\d{3})\\)?-?(\\d{3})-(\\d{4})";
        //String regEx = "^([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[0-9]{7})$";
        //String regEx = "[0-9]{10,16}";
        String regEx = "^[a-zA-Z0-9]+$";        
        RegularExpression exp = new RegularExpression(regEx);
//        System.out.println("3145830521 "+exp.matches("3145830521"));
//        System.out.println("13145830521 "+exp.matches("13145830521"));
//        System.out.println("0119113145830521 "+exp.matches("13145830521"));
//        System.out.println("314-583-0521 "+exp.matches("314-583-0521"));
//        System.out.println("1-314-583-0521 "+exp.matches("1-314-583-0521"));
//        System.out.println("(314)5830521 "+ exp.matches("(314)5830521"));
//        System.out.println("(314) 5830521 "+ exp.matches("(314) 5830521"));
//        System.out.println("(314)-583-0521 "+ exp.matches("(314)-583-0521"));
//        System.out.println("(314)-5830521 "+ exp.matches("(314)-5830521"));
//        System.out.println("314-5830521"+exp.matches("314-5830521"));
//        System.out.println("3145830521-"+exp.matches("3145830521-"));
//        System.out.println("-314-5830521"+exp.matches("-3145830521"));
//        System.out.println("-314583-0521-"+exp.matches("-3145830521"));
//        System.out.println("-3145830521"+exp.matches("-3145830521"));
//        System.out.println("1314583ABCD "+exp.matches("1314583ABCD"));
//        System.out.println("1314583ABCD "+exp.matches("1314583ABCD"));
        System.out.println("1314583ABCD "+exp.matches("1314583ABCD"));
        System.out.println("A314583ABCD "+exp.matches("A1314583ABCD"));
        System.out.println("1314583ABCD_ "+exp.matches("1314583ABCD_"));
        System.out.println("1314583ABCD$ "+exp.matches("1314583ABCD$"));
        System.out.println("1314583ABCD^ "+exp.matches("1314583ABCD^"));
        System.out.println("1 "+exp.matches("1"));
        System.out.println("a "+exp.matches("a"));
        System.out.println(""+exp.matches(""));


    }
	

}
