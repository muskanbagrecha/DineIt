package com.mb.dineit.usermanagement.service;

import com.mb.dineit.exceptions.UserNotFoundException;
import com.mb.dineit.models.User;
import com.mb.dineit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementService {

    @Autowired
    UserRepository userRepository;

    public boolean addUser(String username, String email){
        try{
            userRepository.save(new User(username, email));
            return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    public User findUserById(String userId){
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
    }
}
