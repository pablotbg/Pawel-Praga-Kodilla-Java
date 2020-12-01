package com.kodilla.good.patterns.challenges;

public class User {

    private final String name;
    private final String adress;

    public User(final String name, final String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        return getAdress() != null ? getAdress().equals(user.getAdress()) : user.getAdress() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAdress() != null ? getAdress().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + " in " + adress;
    }
}
