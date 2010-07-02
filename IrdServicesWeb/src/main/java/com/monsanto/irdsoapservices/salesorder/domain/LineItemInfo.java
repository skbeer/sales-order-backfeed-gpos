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
    String salesRepName;
    String salesRepId;
    QuantityInfo salesQuantity = new QuantityInfo();
    QuantityInfo equivalentQuantity = new QuantityInfo();
    QuantityInfo productQuantity = new QuantityInfo();
    QuantityInfo productQuantityEquivalent = new QuantityInfo();
    QuantityInfo shippedQuantity = new QuantityInfo();
    QuantityInfo shippedQuantityEquivalent = new QuantityInfo();
    QuantityInfo deliveredQuantity = new QuantityInfo();
    QuantityInfo deliveredQuantityEquivalent = new QuantityInfo();

    public QuantityInfo getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(QuantityInfo productQuantity) {
        this.productQuantity = productQuantity;
    }

    public QuantityInfo getProductQuantityEquivalent() {
        return productQuantityEquivalent;
    }

    public void setProductQuantityEquivalent(QuantityInfo productQuantityEquivalent) {
        this.productQuantityEquivalent = productQuantityEquivalent;
    }

    public QuantityInfo getShippedQuantity() {
        return shippedQuantity;
    }

    public void setShippedQuantity(QuantityInfo shippedQuantity) {
        this.shippedQuantity = shippedQuantity;
    }

    public QuantityInfo getShippedQuantityEquivalent() {
        return shippedQuantityEquivalent;
    }

    public void setShippedQuantityEquivalent(QuantityInfo shippedQuantityEquivalent) {
        this.shippedQuantityEquivalent = shippedQuantityEquivalent;
    }

    public QuantityInfo getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(QuantityInfo deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public QuantityInfo getDeliveredQuantityEquivalent() {
        return deliveredQuantityEquivalent;
    }

    public void setDeliveredQuantityEquivalent(QuantityInfo deliveredQuantityEquivalent) {
        this.deliveredQuantityEquivalent = deliveredQuantityEquivalent;
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
