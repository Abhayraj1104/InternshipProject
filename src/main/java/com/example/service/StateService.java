package com.example.service;

import java.util.List;


import com.example.entity.State;

public interface StateService {
	List<State> fetchAll();
	State fetchById(int id);
	void deleteById(int id);
	State addData(State state);
	State updateData(State state , int id);

}
