package org.ulpgc.is1.model;

import java.util.Date;

public class Booking {

    private final int id;
    private Date date;

    private Location location;
    private PromotionalCode promotionalCode;

    public Booking(int id, Date date, Location location) {
        this.id = id;
        this.date = date;
        this.location = location;
    }

    public double price() {
        double basePrice = 100.0; // Ejemplo de precio base
        if (promotionalCode != null) {
            return basePrice - (basePrice * promotionalCode.getDiscount() / 100.0);
        }
        return basePrice;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PromotionalCode getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(PromotionalCode promotionalCode) {
        this.promotionalCode = promotionalCode;
    }
}
