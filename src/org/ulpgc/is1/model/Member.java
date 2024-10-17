package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Member extends Customer{
    private final int number;
    private LocalDate birthDate;


    public Member(String name, String surname, int number, LocalDate birthDate) {
        super(name, surname);
        this.number = number;
        this.birthDate = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
