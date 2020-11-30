package com.kodilla.good.patterns.challenges;

public class UserBuyer extends User {

    private final String surname;

    public UserBuyer(final String name, final String surname, final String adress) {
        super(name, adress);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}

