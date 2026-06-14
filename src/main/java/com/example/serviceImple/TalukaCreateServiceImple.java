package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.entity.Taluka;
import com.example.repository.DistrictRepository;
import com.example.repository.TalukaRepository;
import com.example.service.TalukaCreateService;

@Service
public class TalukaCreateServiceImple
        implements TalukaCreateService {

    @Autowired
    private TalukaRepository talukaRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public Taluka addData(Taluka taluka) {

        District district =
                districtRepository.findById(
                        taluka.getDistrict().getDistrictId())
                .orElse(null);

        taluka.setDistrict(district);

        return talukaRepository.save(taluka);
    }
}