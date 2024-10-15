package org.ulpgc.is1.model;

import java.util.Date;

public class Booking {

    private final int id;
    private Date date;

    private Location location;

    public Booking(int id) {
        this.id = id;
    }
}
