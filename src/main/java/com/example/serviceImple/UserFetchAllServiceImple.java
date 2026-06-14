package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserFetchAllService;

@Service
public class UserFetchAllServiceImple
        implements UserFetchAllService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> fetchAll() {

        return repository.findAll();
    }
}