package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private final int license;
    private String brand;
    private String model;
    private int price;

    private Plate plate;
    private VehicleType vehicleType;
    private List<Booking> bookings;


    public Vehicle(int license, String brand, String model, int price, Plate plate, VehicleType vehicleType) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.vehicleType = vehicleType;
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public int getLicense() {
        return license;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
