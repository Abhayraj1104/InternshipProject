package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.entity.Taluka;
import com.example.repository.DistrictRepository;
import com.example.repository.TalukaRepository;
import com.example.service.TalukaUpdateService;

@Service
public class TalukaUpdateServiceImple
        implements TalukaUpdateService {

    @Autowired
    private TalukaRepository talukaRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public Taluka updateData(Taluka taluka,
                             Long id) {

        Taluka existingTaluka =
                talukaRepository.findById(id)
                .orElse(null);

        if(existingTaluka != null) {

            existingTaluka.setTalukaName(
                    taluka.getTalukaName());

            District district =
                    districtRepository.findById(
                            taluka.getDistrict()
                                  .getDistrictId())
                    .orElse(null);

            existingTaluka.setDistrict(district);

            return talukaRepository.save(existingTaluka);
        }

        return null;
    }
}