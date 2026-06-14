package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.TrackingRepository;
import com.example.service.TrackingDeleteService;

@Service
public class TrackingDeleteServiceImple implements TrackingDeleteService {

    @Autowired
    private TrackingRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
