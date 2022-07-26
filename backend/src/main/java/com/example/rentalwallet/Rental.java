package com.example.rentalwallet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Rental {
    @Id
    private final String id = UUID.randomUUID().toString();
    private String name;
    private String location;
    private String price;
    private String url;
    private String photo;//TODO

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;//??
    private String distanceFromWorkOfUser;//TODO
    private boolean visited;

    public User getUser() {
        return user;
    }

    public Rental(){

    }

    public Rental(String name, String location, String price, String url, String photo, boolean visited) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.url = url;
        this.photo = photo;
        this.visited = visited;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDistanceFromWorkOfUser() {
        return distanceFromWorkOfUser;
    }

    public void setDistanceFromWorkOfUser(String distanceFromWorkOfUser) {
        this.distanceFromWorkOfUser = distanceFromWorkOfUser;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
