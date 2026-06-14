package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.entity.State;
import com.example.repository.CountryRepository;
import com.example.repository.StateRepository;
import com.example.service.StateUpdateService;

@Service
public class StateUpdateServiceImple implements StateUpdateService {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public State updateData(State state, Long id) {

        State existingState =
                stateRepository.findById(id)
                               .orElse(null);

        if(existingState != null) {

            existingState.setStateName(
                    state.getStateName());

            Country country =
                    countryRepository.findById(
                            state.getCountry()
                                 .getCountryId())
                    .orElse(null);

            existingState.setCountry(country);

            return stateRepository.save(existingState);
        }

        return null;
    }
}