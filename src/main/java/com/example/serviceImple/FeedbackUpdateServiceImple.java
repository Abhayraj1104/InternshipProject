package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.entity.User;
import com.example.repository.FeedbackRepository;
import com.example.repository.UserRepository;
import com.example.service.FeedbackUpdateService;

@Service
public class FeedbackUpdateServiceImple implements FeedbackUpdateService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Feedback updateData(Feedback feedback, Long id) {
        Feedback existingFeedback = feedbackRepository.findById(id).orElse(null);
        if (existingFeedback != null) {
            existingFeedback.setFeedbackText(feedback.getFeedbackText());

            if (feedback.getUser() != null) {
                User user = userRepository.findById(feedback.getUser().getId()).orElse(null);
                existingFeedback.setUser(user);
            }

            return feedbackRepository.save(existingFeedback);
        }
        return null;
    }
}
