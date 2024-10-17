package org.ulpgc.is1.model;

public class Vehicle {
    private final int license;
    private String brand;
    private String model;
    private int price;
    private VehicleType type;
    private Plate plate;

    public Vehicle(int license, String brand, String model, int price, VehicleType type, Plate plate) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.plate = plate;
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

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
