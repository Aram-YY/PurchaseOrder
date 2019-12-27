package com.csdj.lyn.entity;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/13 8:48
 */
public class Purchasea {
    private int id;
    private String project;
    private String supplier;
    private String suppdate;
    private String suppliercontact;
    private String sarehouse;
    private String buyer;
    private String totalorders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSuppdate() {
        return suppdate;
    }

    public void setSuppdate(String suppdate) {
        this.suppdate = suppdate;
    }

    public String getSuppliercontact() {
        return suppliercontact;
    }

    public void setSuppliercontact(String suppliercontact) {
        this.suppliercontact = suppliercontact;
    }

    public String getSarehouse() {
        return sarehouse;
    }

    public void setSarehouse(String sarehouse) {
        this.sarehouse = sarehouse;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getTotalorders() {
        return totalorders;
    }

    public void setTotalorders(String totalorders) {
        this.totalorders = totalorders;
    }
}
