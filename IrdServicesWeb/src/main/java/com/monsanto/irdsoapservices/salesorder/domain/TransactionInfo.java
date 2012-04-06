package com.monsanto.irdsoapservices.salesorder.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Jun 7, 2010
 * Time: 10:13:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionInfo {
    String name;
    String groupCode;
    String companyCode;
    String transactionType;
    Date startDate;
    Date endDate;
    Date lastTransactionDate;
    long lastTransactionNumber;
    int maxFileSize;
    String dataSourceType;
    List<String> documentIds = new ArrayList<String>();
    String fileType;
    int fileCount;

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(Date lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public long getLastTransactionNumber() {
        return lastTransactionNumber;
    }

    public void setLastTransactionNumber(long lastTransactionNumber) {
        this.lastTransactionNumber = lastTransactionNumber;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public List<String> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<String> documentIds) {
        this.documentIds = documentIds;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileCount() {
        return fileCount;
    }

    public void setFileCount(int fileCount) {
        this.fileCount = fileCount;
    }

    //TODO Add documentIds
    @Override
    public String toString() {
        return "TransactionInfo{" +
                "name='" + name + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", dataSourceType='" + dataSourceType + '\'' +
                ", fileType='" + fileType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", fileCount=" + fileCount +
                ", lastTransactionDate=" + lastTransactionDate +
                ", lastTransactionNumber=" + lastTransactionNumber +
                '}';
    }
}
