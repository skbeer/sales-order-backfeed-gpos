package com.monsanto.irdsoapservices.utils;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 18, 2009
 * Time: 3:09:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlDateTimeUtil {

    public static XMLGregorianCalendar transformToXmlGregorianCalendar(Date date) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return transformToXmlGregorianCalendar(calendar);
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
