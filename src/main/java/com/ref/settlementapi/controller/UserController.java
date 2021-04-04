package com.ref.settlementapi.controller;

import com.ref.settlementapi.model.User;
import com.ref.settlementapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        return this.userService.saveUser(user);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping
    public List<User> getAllUsers() {

        return this.userService.getAll();
    }

}
