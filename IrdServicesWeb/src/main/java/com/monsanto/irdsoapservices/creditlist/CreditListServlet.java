package com.monsanto.irdsoapservices.creditlist;

import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.beans.BeansException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import com.monsanto.irdsoapservices.salesorder.service.SalesOrderReportService;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 17, 2012
 * Time: 10:02:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListServlet extends HttpServlet {

    Logger logger = Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Starting up the CreditList Batch Job");
        PrintWriter writer = resp.getWriter();
        try {
            ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
            CreditListBatchJob creditListJob = (CreditListBatchJob) context.getBean("creditListBatchJob");
            creditListJob.startProcessing();
            writer.print("CreditList job executed Successfully.");
        } catch (BeansException e) {
            e.printStackTrace();
            logger.error(e,e);
            writer.print(e.getMessage());
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while processing Credit List.");
        } catch (SalesOrderException e) {
            e.printStackTrace();
            logger.error(e,e);
            writer.print(e.getMessage());
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while processing Credit List.");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e,e);
            writer.print(e.getMessage());
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while processing Credit List.");
        } finally {
            writer.close();
        }
    }

}
