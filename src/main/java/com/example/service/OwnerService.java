package com.example.service;

import java.util.List;


import com.example.entity.Owner;

public interface OwnerService {
	List<Owner> fetchAll();
	Owner fetchById(int id);
	void deleteById(int id);
	Owner addData(Owner owner);
	Owner updateData(Owner owner , int id);

}
