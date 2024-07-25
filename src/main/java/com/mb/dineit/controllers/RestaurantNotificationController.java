package com.mb.dineit.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantNotificationController {

    @PostMapping("/changestatus")
    public void changeRestaurantStatus(@RequestParam String restaurantId, boolean isOffline){
        //Create observable for restaurant
    }

    @PostMapping("/{restaurantId}/subscribe")
    public void subscribeToRestaurant(){
        //Observer starts observing observable
    }

}
