package com.example.service;

import java.util.List;


import com.example.entity.Manager;

public interface ManagerService {
	List<Manager> fetchAll();
	Manager fetchById(int id);
	void deleteById(int id);
	Manager addData(Manager manager);
	Manager updateData(Manager manager , int id);

}
