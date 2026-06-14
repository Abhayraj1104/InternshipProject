package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.entity.State;
import com.example.repository.CountryRepository;
import com.example.repository.StateRepository;
import com.example.service.StateCreateService;

@Service
public class StateCreateServiceImple
        implements StateCreateService {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public State addData(State state) {

    	Country country =
    	        countryRepository.findById(
    	            state.getCountry().getCountryId()
    	        ).orElse(null);

    	state.setCountry(country);

    	return stateRepository.save(state);    }
}