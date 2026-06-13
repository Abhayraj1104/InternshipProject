package com.example.service;

import java.util.List;


import com.example.entity.Type;

public interface TypeService {
	List<Type> fetchAll();
	Type fetchById(int id);
	void deleteById(int id);
	Type addData(Type type);
	Type updateData(Type type , int id);

}
