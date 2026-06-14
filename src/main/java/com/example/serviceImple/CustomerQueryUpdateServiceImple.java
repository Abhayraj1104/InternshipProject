package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CustomerQuery;
import com.example.entity.User;
import com.example.repository.CustomerQueryRepository;
import com.example.repository.UserRepository;
import com.example.service.CustomerQueryUpdateService;

@Service
public class CustomerQueryUpdateServiceImple implements CustomerQueryUpdateService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomerQuery updateData(CustomerQuery customerQuery, Long id) {
        CustomerQuery existingQuery = customerQueryRepository.findById(id).orElse(null);
        if (existingQuery != null) {
            existingQuery.setQueryText(customerQuery.getQueryText());

            if (customerQuery.getUser() != null) {
                User user = userRepository.findById(customerQuery.getUser().getId()).orElse(null);
                existingQuery.setUser(user);
            }

            return customerQueryRepository.save(existingQuery);
        }
        return null;
    }
}
