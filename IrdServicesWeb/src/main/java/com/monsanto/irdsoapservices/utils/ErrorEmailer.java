package com.monsanto.irdsoapservices.utils;

import org.apache.log4j.Logger;

import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import java.net.InetAddress;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ErrorEmailer extends AbstractEmailer {
	Logger logger = Logger.getLogger(ErrorEmailer.class);
	private static final String IRDSERVICES_ERROR = "IRDSoapServices Error Notification";
	private String toAddress = null;
	public void sendErrorEmail(Throwable exception, String errorMessage) {
		try {
			sendMessage(getErrorSubject(), createHtmlErrorMessage(exception, errorMessage));
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
	
	@Override
	protected Address getFromAddress() throws Exception {
		return new InternetAddress("SYSTEM@"+InetAddress.getLocalHost().getHostName().toUpperCase()+".MONSANTO.COM");
	}

	@Override
	protected Address[] getToAddress() throws Exception {
		return new Address[]{new InternetAddress(StringUtils.isNullOrEmpty(toAddress)? Configuration.getInstance().getProperty(Configuration.ERROR_TO_EMAIL_ADDRESS)
				:toAddress.trim())};
	}
	
	public void setToAddress(String emailaddress) {
		toAddress = emailaddress;
	}
	
	private String createHtmlErrorMessage(Throwable exception, String errorMessage) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(errorMessage);
		sBuffer.append(NEW_LINE);
		sBuffer.append(NEW_LINE);
		sBuffer.append(exception.getMessage());
		sBuffer.append(NEW_LINE);
		for(StackTraceElement stackTrace: exception.getStackTrace()) {
			sBuffer.append(stackTrace.toString());
			sBuffer.append(NEW_LINE);
		}		
		return sBuffer.toString();
	}
	
	private String getErrorSubject() throws Exception {
		return IRDSERVICES_ERROR+" ("+InetAddress.getLocalHost().getHostName()+")";
	}
}
