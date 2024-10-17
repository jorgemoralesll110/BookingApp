package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Booking {
    private final int id;
    private LocalDate date;
    private Customer customer;
    private Vehicle vehicle;
    private PromotionalCode promotionalCode;
    private Location from;
    private Location to;

    public Booking(int id, LocalDate date, Customer customer, Vehicle vehicle, PromotionalCode promotionalCode, Location from, Location to) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.vehicle = vehicle;
        this.promotionalCode = promotionalCode;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public PromotionalCode getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(PromotionalCode promotionalCode) {
        this.promotionalCode = promotionalCode;
    }

    public Location getFrom() {
        return from;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }

    public int price() {
        int finalPrice = vehicle.getPrice();
        if (promotionalCode != null) {
            finalPrice -= (finalPrice * promotionalCode.getDiscount()) / 100;
        }
        return finalPrice;
    };

}
