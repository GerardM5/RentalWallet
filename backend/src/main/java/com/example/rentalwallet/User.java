package com.example.rentalwallet;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "users")
public class User {

    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String userName;
    private String password;
    private String workLocation;
    private String role;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Rental> rentals = new ArrayList<>();

    public User() {

    }


    public User(String name, String userName, String password, String workLocation) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.workLocation = workLocation;
        this.rentals = null;
    }

    public User updateUser(User user){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.workLocation = workLocation;
        return user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
