package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserCreateService;
import com.example.service.UserDeleteService;
import com.example.service.UserFetchAllService;
import com.example.service.UserFetchService;
import com.example.service.UserUpdateService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserCreateService userCreateService;

    @Autowired
    private UserDeleteService userDeleteService;

    @Autowired
    private UserUpdateService userUpdateService;

    @Autowired
    private UserFetchService userFetchService;

    @Autowired
    private UserFetchAllService userFetchAllService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {

        return userCreateService.addData(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {

        userDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<User> fetchAllUser() {

        return userFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public User fetchUser(@PathVariable int id) {

        return userFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user,
                           @PathVariable int id) {

        return userUpdateService.updateData(user, id);
    }
}