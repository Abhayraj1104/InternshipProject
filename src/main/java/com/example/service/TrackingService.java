package com.example.service;

import java.util.List;


import com.example.entity.Tracking;

public interface TrackingService {
	List<Tracking> fetchAll();
	Tracking fetchById(int id);
	void deleteById(int id);
	Tracking addData(Tracking tracking);
	Tracking updateData(Tracking tracking , int id);

}
