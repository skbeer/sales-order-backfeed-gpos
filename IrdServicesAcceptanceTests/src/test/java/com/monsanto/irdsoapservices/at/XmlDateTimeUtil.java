package com.monsanto.irdsoapservices.at;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import java.util.Date;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: CAGGARW
 * Date: Apr 1, 2010
 * Time: 1:16:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlDateTimeUtil {

    public static XMLGregorianCalendar transformToXmlGregorianCalendar(Date date) throws Exception {
        if(date!= null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return transformToXmlGregorianCalendar(calendar);
        } else {
            return null;
        }
    }

    public static XMLGregorianCalendar transformToXmlGregorianCalendar(Calendar calendar) throws Exception {
        XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        xmlCal.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        // We do a +1 below because XMLGregorianCalendar goes from 1 to 12
        // while Calendar.MONTH goes from 0 to 11 !!!
        xmlCal.setMonth(calendar.get(Calendar.MONTH) + 1);
        xmlCal.setYear(calendar.get(Calendar.YEAR));
        xmlCal.setTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND));
        return xmlCal;
    }

    public static Date transformFromXmlGregorianCalendar(XMLGregorianCalendar xmlGregCalendar) throws Exception {
        Calendar calendar = xmlGregCalendar.toGregorianCalendar();
        Date date = new Date();
        date.setTime(calendar.getTimeInMillis());
        return date;
    }


}
