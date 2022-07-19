package com.example.rentalwallet;

import java.util.List;
import java.util.UUID;

public class User {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private String userName;
    private String password;
    private String workLocation;
    private List<Rental> rentals;

    public User() {

    }

    public User(String name, String userName, String password, String workLocation) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.workLocation = workLocation;
        this.rentals = null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
}
