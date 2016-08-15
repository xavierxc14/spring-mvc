package com.twu.service;

import com.twu.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> allUsers;

    private User user;

    public UserService() {
        this.allUsers = new ArrayList<>();
    }

    public List<User> findAll() {
        //Alguna conexion a la base
        for (int i = 0; i < 5; i++) {
            User u = new User("User " + i, "user s" + i, "user" + i + "@gmail.com");
            allUsers.add(u);
        }
        return allUsers;
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
