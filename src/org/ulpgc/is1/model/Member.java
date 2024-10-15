package org.ulpgc.is1.model;

import java.util.Date;

class Member extends Customer{
    private final int number;

    private Date birthdate;


    public Member(String name, String surname, int number) {
        super(name, surname);
        this.number = number;
    }
}
