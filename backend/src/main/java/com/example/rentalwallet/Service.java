package com.example.rentalwallet;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Service {

    private UserRepository userRepository;
    private RentalRepository rentalRepository;

    public Service(UserRepository userRepository, RentalRepository rentalRepository) {
        this.userRepository = userRepository;
        this.rentalRepository = rentalRepository;
    }

    //USERS

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUserList(){
        return userRepository.findAll().stream().toList();
    }

    public User getUser (String userId){
        return userRepository.getById(userId);
    }

    public void deleteUser (String userId){
        userRepository.deleteById(userId);
    }

    public void deleteUserList(){
        userRepository.deleteAll();
    }

    public User updateUser(String userId, User user) {
        User us = userRepository.getById(userId);
        us.updateUser(user);
        return userRepository.save(us);
        //TODO igual hay que extender individualmente
    }

    //RENTALS

    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public List<Rental> getRentalList(){
        return rentalRepository.findAll().stream().toList();
    }

    public Rental getRental(String rentalId){
        return rentalRepository.getById(rentalId);
    }

    public void deleteRentalList(){
        rentalRepository.deleteAll();
    }

    public void deleteRental(String rentalId){
        rentalRepository.deleteById(rentalId);
    }
}
