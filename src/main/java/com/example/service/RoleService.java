package com.example.service;

import java.util.List;


import com.example.entity.Role;

public interface RoleService {
	List<Role> fetchAll();
	Role fetchById(int id);
	void deleteById(int id);
	Role addData(Role role);
	Role updateData(Role role , int id);

}
