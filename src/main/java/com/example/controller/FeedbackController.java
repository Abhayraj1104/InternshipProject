package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Feedback;
import com.example.service.FeedbackCreateService;
import com.example.service.FeedbackDeleteService;
import com.example.service.FeedbackFetchAllService;
import com.example.service.FeedbackFetchService;
import com.example.service.FeedbackUpdateService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackCreateService feedbackCreateService;

    @Autowired
    private FeedbackDeleteService feedbackDeleteService;

    @Autowired
    private FeedbackUpdateService feedbackUpdateService;

    @Autowired
    private FeedbackFetchService feedbackFetchService;

    @Autowired
    private FeedbackFetchAllService feedbackFetchAllService;

    @PostMapping("/save")
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return feedbackCreateService.addData(feedback);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Feedback> fetchAllFeedback() {
        return feedbackFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Feedback fetchFeedback(@PathVariable Long id) {
        return feedbackFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Feedback updateFeedback(@RequestBody Feedback feedback,
                                   @PathVariable Long id) {
        return feedbackUpdateService.updateData(feedback, id);
    }
}
