package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Type;
import com.example.repository.TypeRepository;
import com.example.service.TypeCreateService;

@Service
public class TypeCreateServiceImple  implements TypeCreateService{
	  @Autowired
	    private TypeRepository repository;

	    @Override
	    public Type addData(Type type) {
	        return repository.save(type);
	    }

		

}
