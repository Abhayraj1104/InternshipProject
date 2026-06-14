package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Type;
import com.example.repository.TypeRepository;
import com.example.service.TypeFetchService;
@Service
public class TypeFetchServiceImple implements TypeFetchService{
	 @Autowired
	    private TypeRepository repository;

	    @Override
	    public Type fetchById(int id) {
	        return repository.findById(id).orElse(null);
	    }

}
