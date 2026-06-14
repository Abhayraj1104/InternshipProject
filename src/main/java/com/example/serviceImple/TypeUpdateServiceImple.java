package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Type;
import com.example.repository.TypeRepository;
import com.example.service.TypeUpdateService;

@Service
public class TypeUpdateServiceImple implements TypeUpdateService {

    @Autowired
    private TypeRepository repository;

    @Override
    public Type updateData(Type type, int id) {

        Type existingType = repository.findById(id).orElse(null);

        if(existingType != null) {
            existingType.setTypeName(type.getTypeName());
            return repository.save(existingType);
        }

        return null;
    }
}