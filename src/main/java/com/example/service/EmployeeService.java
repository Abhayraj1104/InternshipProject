package com.example.service;

import java.util.List;


import com.example.entity.Employee;

public interface EmployeeService {
	List<Employee> fetchAll();
	Employee fetchById(int id);
	void deleteById(int id);
	Employee addData(Employee employee);
	Employee updateData(Employee employee , int id);

}
