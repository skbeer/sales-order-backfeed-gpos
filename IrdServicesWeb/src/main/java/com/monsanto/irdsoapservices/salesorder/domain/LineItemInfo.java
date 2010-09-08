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
    PartnerInfo salesRep;
    QuantityInfo salesQuantity = new QuantityInfo();
    QuantityInfo equivalentQuantity = new QuantityInfo();
    String orderQty;
    String shippedQty;
    String pendingQty;
    String qtyUom = "UN";

    public String getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    public String getShippedQty() {
        return shippedQty;
    }

    public void setShippedQty(String shippedQty) {
        this.shippedQty = shippedQty;
    }

    public String getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(String pendingQty) {
        this.pendingQty = pendingQty;
    }

    public String getQtyUom() {
        return qtyUom;
    }

    public void setQtyUom(String qtyUom) {
        this.qtyUom = qtyUom;
    }

    public PartnerInfo getSalesRep() {
        return salesRep;
    }

    public void setSalesRep(PartnerInfo salesRep) {
        this.salesRep = salesRep;
    }

    public QuantityInfo getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(QuantityInfo salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public QuantityInfo getEquivalentQuantity() {
        return equivalentQuantity;
    }

    public void setEquivalentQuantity(QuantityInfo equivalentQuantity) {
        this.equivalentQuantity = equivalentQuantity;
    }

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
}
