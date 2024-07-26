package com.mb.dineit.service;

import com.mb.dineit.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManagementService {
    List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void removeRestaurant(String restaurantId){
        if(restaurantId==null){
            return;
        }
        restaurants.removeIf(restaurant -> restaurantId.equals(restaurant.getId()));
    }
}
