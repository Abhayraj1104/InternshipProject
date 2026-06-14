package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Tracking;
import com.example.repository.TrackingRepository;
import com.example.service.TrackingFetchService;

@Service
public class TrackingFetchServiceImple implements TrackingFetchService {

    @Autowired
    private TrackingRepository repository;

    @Override
    public Tracking fetchById(Long id) {
        return repository.findById(id).get();
    }
}
