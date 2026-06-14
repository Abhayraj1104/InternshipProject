package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.entity.State;
import com.example.repository.DistrictRepository;
import com.example.repository.StateRepository;
import com.example.service.DistrictUpdateService;

@Service
public class DistrictUpdateServiceImple
        implements DistrictUpdateService {

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private StateRepository stateRepository;

    @Override
    public District updateData(District district,
                               Long id) {

        District existingDistrict =
                districtRepository.findById(id)
                .orElse(null);

        if(existingDistrict != null) {

            existingDistrict.setDistrictName(
                    district.getDistrictName());

            State state =
                    stateRepository.findById(
                            district.getState().getStateId())
                    .orElse(null);

            existingDistrict.setState(state);

            return districtRepository.save(existingDistrict);
        }

        return null;
    }
}