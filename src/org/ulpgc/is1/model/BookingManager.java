package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Customer> customers;
    private List<PromotionalCode> promotionalCodes;
    private List<Vehicle> vehicles;
    private List<Booking> bookings;

    public BookingManager() {
        this.customers = new ArrayList<>();
        this.promotionalCodes = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public void addMember(Member member) {
        customers.add(member);
    }

    public Member getMember(int index) {
        Customer customer = customers.get(index);
        if (customer instanceof Member) {
            return (Member) customer;
        }
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle getVehicle(int index) {
        return vehicles.get(index);
    }

    public void addPromotionalCode(PromotionalCode promoCode) {
        promotionalCodes.add(promoCode);
    }

    public PromotionalCode getPromotionalCode(int index) {
        return promotionalCodes.get(index);
    }
    public void book(Customer customer, Vehicle vehicle, PromotionalCode promoCode, Booking booking) {
        booking.setPromotionalCode(promoCode);
        bookings.add(booking);
        customer.addBooking(booking);
        vehicle.addBooking(booking);
    }

    public List<Booking> getBookingList() {
        return bookings;
    }
}
