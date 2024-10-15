package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Customer> customers = new ArrayList<Customer>();
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    private List<PromotionalCode> promotionalCodes = new ArrayList<PromotionalCode>();
    private List<Member> members = new ArrayList<Member>();
    private List<Booking> bookingList = new ArrayList<Booking>();

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
        }
    }

}
