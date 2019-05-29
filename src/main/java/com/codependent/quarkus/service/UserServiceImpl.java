package com.codependent.quarkus.service;

import com.codependent.quarkus.dto.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<User>() {{
        add(new User(1, "Joe"));
        add(new User(2, "Anna"));
    }};


    public List<User> getAllUsers() {
        return users;
    }

}
