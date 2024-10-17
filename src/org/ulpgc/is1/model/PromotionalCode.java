package org.ulpgc.is1.model;

public class PromotionalCode {
    private String id;
    private int discount;

    public PromotionalCode(String id, int discount) {
        this.id = id;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
