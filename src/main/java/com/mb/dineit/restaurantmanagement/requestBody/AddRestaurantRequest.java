package com.mb.dineit.restaurantmanagement.requestBody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddRestaurantRequest {
    private String restaurantName;
    private boolean isAvailable;
}
