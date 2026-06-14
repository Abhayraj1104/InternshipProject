package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;
import com.example.service.FeedbackFetchAllService;

@Service
public class FeedbackFetchAllServiceImple implements FeedbackFetchAllService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public List<Feedback> fetchAll() {
        return repository.findAll();
    }
}
