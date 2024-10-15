package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return number != null && number.matches("[A-Z0-9]+"); // Solo letras y números
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
