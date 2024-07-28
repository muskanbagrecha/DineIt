package com.mb.dineit.usermanagement.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddUserRequest {
    private String username;
    private String email;
}
