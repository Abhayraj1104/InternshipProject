package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Tracking;
import com.example.repository.TrackingRepository;
import com.example.service.TrackingFetchAllService;

@Service
public class TrackingFetchAllServiceImple implements TrackingFetchAllService {

    @Autowired
    private TrackingRepository repository;

    @Override
    public List<Tracking> fetchAll() {
        return repository.findAll();
    }
}
