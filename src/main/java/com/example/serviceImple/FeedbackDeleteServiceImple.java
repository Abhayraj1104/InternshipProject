package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.FeedbackRepository;
import com.example.service.FeedbackDeleteService;

@Service
public class FeedbackDeleteServiceImple implements FeedbackDeleteService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
