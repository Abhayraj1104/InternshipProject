package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.entity.State;
import com.example.repository.DistrictRepository;
import com.example.repository.StateRepository;
import com.example.service.DistrictCreateService;

@Service
public class DistrictCreateServiceImple implements DistrictCreateService {

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private StateRepository stateRepository;

    @Override
    public District addData(District district) {

        State state =
                stateRepository.findById(
                        district.getState().getStateId())
                .orElse(null);

        district.setState(state);

        return districtRepository.save(district);
    }
}