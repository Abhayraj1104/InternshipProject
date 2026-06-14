package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Tracking;
import com.example.repository.TrackingRepository;
import com.example.service.TrackingCreateService;

@Service
public class TrackingCreateServiceImple implements TrackingCreateService {

    @Autowired
    private TrackingRepository repository;

    @Override
    public Tracking addData(Tracking tracking) {
        return repository.save(tracking);
    }
}
