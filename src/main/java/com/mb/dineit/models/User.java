package com.mb.dineit.models;

import com.mb.dineit.notification.NotificationStrategy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private List<NotificationStrategy> notificationStrategies;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.notificationStrategies = new ArrayList<>();
    }

}
