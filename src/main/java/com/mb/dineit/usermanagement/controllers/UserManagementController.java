package com.mb.dineit.usermanagement.controllers;

import com.mb.dineit.responseBody.ResponseBody;
import com.mb.dineit.usermanagement.request.AddUserRequest;
import com.mb.dineit.usermanagement.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserManagementController {

    @Autowired
    UserManagementService userManagementService;

    @PostMapping("/add")
    public ResponseEntity<ResponseBody> addUser(@RequestBody AddUserRequest addUserRequest){
        boolean isSuccessful = userManagementService.addUser(addUserRequest.getUsername(), addUserRequest.getEmail());
        if(isSuccessful){
            return new ResponseEntity<>(new ResponseBody("Added user successfully"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new ResponseBody("Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
