package com.example.service;

import java.util.List;


import com.example.entity.Admin;

public interface AdminService {
	List<Admin> fetchAll();
	Admin fetchById(int id);
	void deleteById(int id);
	Admin addData(Admin admin);
	Admin updateData(Admin admin , int id);

}
