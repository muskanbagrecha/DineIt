package com.mb.dineit.restaurantmanagement.service;

import com.mb.dineit.models.Restaurant;
import com.mb.dineit.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantManagementService {

    @Autowired
    RestaurantRepository restaurantRepository;

    public boolean addRestaurant(String restaurantName, boolean isAvailable){
        try {
            restaurantRepository.save(new Restaurant(restaurantName, isAvailable));
            return true;
        }
        catch (Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    public boolean removeRestaurant(String restaurantId){
        if(restaurantId==null){
            return false;
        }
        try{
            restaurantRepository.deleteById(restaurantId);
            return true;
        }
        catch (Exception ex){
            System.out.println(ex);
            return false;
        }
    }
}
