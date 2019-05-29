package com.codependent.quarkus.service;

import com.codependent.quarkus.dto.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
}
