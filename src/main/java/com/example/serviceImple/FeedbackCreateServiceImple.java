package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;
import com.example.service.FeedbackCreateService;

@Service
public class FeedbackCreateServiceImple implements FeedbackCreateService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public Feedback addData(Feedback feedback) {
        return repository.save(feedback);
    }
}
