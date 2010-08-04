package com.monsanto.irdsoapservices.salesorder.servlet;

import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.service.SalesOrderReportService;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 11, 2010
 * Time: 2:39:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderServlet extends HttpServlet {
    Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Starting up the SalesOrder Job");
        PrintWriter writer = resp.getWriter();
        try {
            ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
            SalesOrderReportService salesOrderService = (SalesOrderReportService) context.getBean("salesOrderService");
            salesOrderService.startProcessing();
            writer.print("SalesOrder executed Successfully.");
        } catch (BeansException e) {
            e.printStackTrace();
            logger.error(e);
            writer.print(e.getMessage());
        } catch (SalesOrderException e) {
            e.printStackTrace();
            logger.error(e);
            writer.print(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            writer.print(e.getMessage());
        } finally {
            writer.close();
        }
    }
}
