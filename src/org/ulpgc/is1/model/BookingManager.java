package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Customer> customers = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<PromotionalCode> promotionalCodes = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Booking> bookingList = new ArrayList<>();


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

    public void addPromotionalCode(PromotionalCode promotionalCode) {
        if (!promotionalCodes.contains(promotionalCode)) {
            promotionalCodes.add(promotionalCode);
        }
    }

    public void addMember(Member member) {
        if (!members.contains(member)) {
            members.add(member);
        }
    }

    public void Book(Booking booking) {
        if (!bookingList.contains(booking)) {
            bookingList.add(booking);
        }
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }
}
