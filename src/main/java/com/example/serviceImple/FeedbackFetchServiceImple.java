package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;
import com.example.service.FeedbackFetchService;

@Service
public class FeedbackFetchServiceImple implements FeedbackFetchService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public Feedback fetchById(Long id) {
        return repository.findById(id).get();
    }
}
