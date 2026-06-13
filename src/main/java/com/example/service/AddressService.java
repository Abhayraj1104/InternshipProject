package com.example.service;

import java.util.List;

import com.example.entity.Address;

public interface AddressService {
	List<Address> fetchAll();
	Address fetchById(int id);
	void deleteById(int id);
	Address addData(Address address);
	Address updateData(Address address , int id);
	
	
}
