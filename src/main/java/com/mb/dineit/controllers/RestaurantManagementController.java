package com.mb.dineit.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantManagementController {

    @PostMapping("/add")
    public void addRestaurant(){

    }

    @PostMapping("/remove/{restaurantId}")
    public void removeRestaurant(){

    }
}
