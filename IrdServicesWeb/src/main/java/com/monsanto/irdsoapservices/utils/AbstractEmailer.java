package com.monsanto.irdsoapservices.utils;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractEmailer {

	private static final String HOST_KEY = "mail.smtp.host";
	private static final String EMAIL_MIME_TYPE="text/html";
	protected static final String NEW_LINE = "<br/>";
	
	protected abstract Address[] getToAddress() throws Exception;
	protected abstract Address getFromAddress() throws Exception;

	private Message message;

	protected void sendMessage(String subject, String htmlBody) throws Exception {
		Properties props = getTransportProperties();
		Session session = Session.getInstance(props);
		message = new MimeMessage(session);	
		message.setSubject(subject);
		message.setFrom(getFromAddress());
		message.setRecipients(MimeMessage.RecipientType.TO, getToAddress());
		htmlBody = htmlBody.replaceAll("\n", NEW_LINE);
		message.setContent(htmlBody, EMAIL_MIME_TYPE);
		Transport.send(message);
	}

	private Properties getTransportProperties() {
		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
		if (!props.containsKey(HOST_KEY)) {
			props.put(HOST_KEY, "mail.monsanto.com");
		}
		return props;
	}

}