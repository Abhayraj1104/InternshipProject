package com.example.service;

import java.util.List;


import com.example.entity.Feedback;

public interface FeedbackService {
	List<Feedback> fetchAll();
	Feedback fetchById(int id);
	void deleteById(int id);
	Feedback addData(Feedback feedback);
	Feedback updateData(Feedback feedback , int id);

}
