package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}