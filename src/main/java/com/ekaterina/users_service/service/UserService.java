package com.ekaterina.users_service.service;

import com.ekaterina.users_service.model.Role;
import com.ekaterina.users_service.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
