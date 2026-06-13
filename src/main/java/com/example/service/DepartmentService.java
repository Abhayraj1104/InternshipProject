package com.example.service;

import java.util.List;


import com.example.entity.Department;

public interface DepartmentService {
	List<Department> fetchAll();
	Department fetchById(int id);
	void deleteById(int id);
	Department addData(Department department);
	Department updateData(Department department , int id);

}
