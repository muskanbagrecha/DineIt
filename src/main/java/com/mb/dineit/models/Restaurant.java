package com.mb.dineit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Restaurant {

    public Restaurant(String name, boolean isAvailable){
        this.name = name;
        this.isAvailable = isAvailable;
    }

    private String id;

    private String name;

    private boolean isAvailable;
}
