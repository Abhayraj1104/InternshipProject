package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Taluka;
import com.example.entity.Town;
import com.example.repository.TalukaRepository;
import com.example.repository.TownRepository;
import com.example.service.TownUpdateService;

@Service
public class TownUpdateServiceImple
        implements TownUpdateService {

    @Autowired
    private TownRepository townRepository;

    @Autowired
    private TalukaRepository talukaRepository;

    @Override
    public Town updateData(Town town,
                           Long id) {

        Town existingTown =
                townRepository.findById(id)
                .orElse(null);

        if(existingTown != null) {

            existingTown.setTownName(
                    town.getTownName());

            Taluka taluka =
                    talukaRepository.findById(
                            town.getTaluka()
                                .getTalukaId())
                    .orElse(null);

            existingTown.setTaluka(taluka);

            return townRepository.save(existingTown);
        }

        return null;
    }
}