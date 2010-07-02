package com.monsanto.irdsoapservices.salesorder.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 9:53:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class QuantityInfo {
    String qtyValue;
    String qtyUom;

    public String getQtyValue() {
        return qtyValue;
    }

    public void setQtyValue(String qtyValue) {
        this.qtyValue = qtyValue;
    }

    public String getQtyUom() {
        return qtyUom;
    }

    public void setQtyUom(String qtyUom) {
        this.qtyUom = qtyUom;
    }
}
