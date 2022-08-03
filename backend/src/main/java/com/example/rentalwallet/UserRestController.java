package com.example.rentalwallet;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private Service service;

    public UserRestController(Service service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId) {
        return service.getUser(userId);
    }

    @GetMapping
    public List<User> getUserList() {
        return service.getUserList();
    }

    @DeleteMapping
    public void deleteUserList() {
        service.deleteUserList();
    }


    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        service.deleteUser(userId);
    }

    @PostMapping("/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User user) {
        return service.updateUser(userId, user);
    }


}
