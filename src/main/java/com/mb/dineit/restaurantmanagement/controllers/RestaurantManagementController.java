package com.mb.dineit.restaurantmanagement.controllers;

import com.mb.dineit.responseBody.ResponseBody;
import com.mb.dineit.restaurantmanagement.service.AddRestaurantRequest;
import com.mb.dineit.restaurantmanagement.service.RestaurantManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantManagementController {

    @Autowired
    RestaurantManagementService restaurantManagementService;

    @PostMapping("/add")
    public ResponseEntity<ResponseBody> addRestaurant(@RequestBody AddRestaurantRequest addRestaurantRequest) throws MessagingException {
        boolean isSuccessful = restaurantManagementService.addRestaurant(addRestaurantRequest.getRestaurantName(), addRestaurantRequest.isAvailable());
        if(isSuccessful){
            return new ResponseEntity<>(new ResponseBody("Added restaurant successfully"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new ResponseBody("Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/remove/{restaurantId}")
    public ResponseEntity<ResponseBody> removeRestaurant(@PathVariable String restaurantId){
        boolean isSuccessful = restaurantManagementService.removeRestaurant(restaurantId);
        if(isSuccessful){
            return new ResponseEntity<>(new ResponseBody("Deleted restaurant successfully"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new ResponseBody("Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
