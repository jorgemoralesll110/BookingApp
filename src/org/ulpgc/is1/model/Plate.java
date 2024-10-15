package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return number != null && number.matches("\\d{4}[A-Z]{3}");
    }
}
