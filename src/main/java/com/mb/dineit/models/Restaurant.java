package com.mb.dineit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class Restaurant {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String name;
}
