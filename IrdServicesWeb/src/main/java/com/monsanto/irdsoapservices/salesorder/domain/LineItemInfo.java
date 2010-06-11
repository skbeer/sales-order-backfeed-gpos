package com.monsanto.irdsoapservices.salesorder.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 11:15:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class LineItemInfo {
    String itemNumber;
    String productUpc;
    String productGtin;
    String productName;
    String salesQuantity;
    String salesQuantityUom;
    String equivalentQuantity;
    String equivalentQuantityUom;
    String salesRepName;
    String salesRepId;

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    public String getProductGtin() {
        return productGtin;
    }

    public void setProductGtin(String productGtin) {
        this.productGtin = productGtin;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getSalesQuantityUom() {
        return salesQuantityUom;
    }

    public void setSalesQuantityUom(String salesQuantityUom) {
        this.salesQuantityUom = salesQuantityUom;
    }

    public String getEquivalentQuantity() {
        return equivalentQuantity;
    }

    public void setEquivalentQuantity(String equivalentQuantity) {
        this.equivalentQuantity = equivalentQuantity;
    }

    public String getEquivalentQuantityUom() {
        return equivalentQuantityUom;
    }

    public void setEquivalentQuantityUom(String equivalentQuantityUom) {
        this.equivalentQuantityUom = equivalentQuantityUom;
    }

    public String getSalesRepName() {
        return salesRepName;
    }

    public void setSalesRepName(String salesRepName) {
        this.salesRepName = salesRepName;
    }

    public String getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(String salesRepId) {
        this.salesRepId = salesRepId;
    }
}
