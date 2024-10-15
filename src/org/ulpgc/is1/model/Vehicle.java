package org.ulpgc.is1.model;

public class Vehicle {
    private final int license;
    private String brand;
    private String model;
    private String plate;
    private int price;
    private VehicleType type;


    public Vehicle(int license, String brand, String model, String plate, int price, VehicleType type) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.type = type;
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }
}
