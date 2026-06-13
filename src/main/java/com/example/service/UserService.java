package com.example.service;

import java.util.List;


import com.example.entity.User;

public interface UserService {
	List<User> fetchAll();
	User fetchById(int id);
	void deleteById(int id);
	User addData(User user);
	User updateData(User user , int id);

}
