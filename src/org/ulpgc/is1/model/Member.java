package org.ulpgc.is1.model;

import java.util.Date;

public class Member extends Customer {
    private final int number;
    private Date birthDate;

    public Member(String name, String surname, int number, Date birthDate) {
        super(name, surname);
        this.number = number;
        this.birthDate = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}