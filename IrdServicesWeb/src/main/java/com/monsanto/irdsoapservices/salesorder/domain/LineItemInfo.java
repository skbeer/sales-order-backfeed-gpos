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
    String orderTransactionType;
    String specie_descr;
    String productNum;
    String lineIdentifier;
//    String acronymName;

    public String getSpecie_descr() {
        return specie_descr;
    }

    public void setSpecie_descr(String specie_descr) {
        this.specie_descr = specie_descr;
    }

    public String getSeed_co_brand_descr() {
        return seed_co_brand_descr;
    }

    public void setSeed_co_brand_descr(String seed_co_brand_descr) {
        this.seed_co_brand_descr = seed_co_brand_descr;
    }

    String seed_co_brand_descr;

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

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getLineIdentifier() {
        return lineIdentifier;
    }

    public void setLineIdentifier(String lineIdentifier) {
        this.lineIdentifier = lineIdentifier;
    }

//    public String getAcronymName() {
//        return acronymName;
//    }
//
//    public void setAcronymName(String acronymName) {
//        this.acronymName = acronymName;
//    }



    public String getOrderTransactionType() {
        return orderTransactionType;
    }

    public void setOrderTransactionType(String orderTransactionType) {
        this.orderTransactionType = orderTransactionType;
    }
}
