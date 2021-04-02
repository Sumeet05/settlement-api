package com.ref.settlementapi.service;

import com.ref.settlementapi.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAll();
}
