package com.monsanto.irdsoapservices.creditlist;

import com.monsanto.irdsoapservices.utils.AbstractEmailer;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.Configuration;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;

import javax.mail.Address;
import javax.mail.internet.InternetAddress;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Sep 7, 2012
 * Time: 1:02:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListErrorEmailer extends AbstractEmailer {
    Logger logger = Logger.getLogger(this.getClass());
	private static final String SUBJECT = "File Transfer Failure Notification";

    public void sendEmail(List<GrowerInfo> growerList, String partnerName) {
		try {
			sendMessage(getSubject(), createHtmlErrorMessage(growerList, partnerName));
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
	}

	@Override
	protected Address getFromAddress() throws Exception {
		return new InternetAddress(Configuration.getInstance().getProperty(Configuration.CREDITLIST_FROM_EMAIL_ADDRESS));
	}

	@Override
	protected Address[] getToAddress() throws Exception {
        String delimitedToAddress = Configuration.getInstance().getProperty(Configuration.CREDITLIST_TO_EMAIL_ADDRESS);
        String[] splittedToAddresses = delimitedToAddress.split(";");
        Address[] toEmails = new InternetAddress[splittedToAddresses.length];
        for (int index = 0; index < toEmails.length; index++) {
            toEmails[index] = new InternetAddress(splittedToAddresses[index]);
        }
        return toEmails;
	}

	private String createHtmlErrorMessage(List<GrowerInfo> growerList, String partnerName) {
		StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("<head>");
        sBuffer.append("<STYLE TYPE=\"text/css\">");
        sBuffer.append("body{font-family: Arial; font-size:15}");
        sBuffer.append("TD{font-family: Arial; font-size:15}");
        sBuffer.append("TH{font-family: Arial; font-size:15}");
        sBuffer.append("</STYLE>");
        sBuffer.append("</head><body>");
        sBuffer.append(NEW_LINE);
        sBuffer.append("This message is being generated due to a failure of transmitting of FarmFlex data for "+partnerName+".\n\n" +
                "The following Account(s) do not have an associated GLN#, please update master data.\n");
		sBuffer.append(NEW_LINE);
        sBuffer.append("<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">");
        sBuffer.append("<tr style=\"background-color:#dddddd\">");
        sBuffer.append("<th>IRD#</th><th>Grower Name</th></tr>");
        for(GrowerInfo growerInfo: growerList) {
			sBuffer.append("<tr><td>"+growerInfo.getAccountId()+"</td><td>"+growerInfo.getName()+"</td></tr>");
		}
        sBuffer.append("</table>");
        sBuffer.append(NEW_LINE);
        sBuffer.append(NEW_LINE);
        sBuffer.append("<small>Environment: "+System.getProperty("lsi.function").toUpperCase()+"</small></body>");
		return sBuffer.toString();
	}

	private String getSubject() throws Exception {
		return SUBJECT;
	}
}
