package com.example.rentalwallet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{user_id}/rentals")
public class RentalRestController {

    private Service service;

    public RentalRestController(Service service) {
        this.service = service;
    }
}
