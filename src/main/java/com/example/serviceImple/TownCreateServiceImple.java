package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Taluka;
import com.example.entity.Town;
import com.example.repository.TalukaRepository;
import com.example.repository.TownRepository;
import com.example.service.TownCreateService;

@Service
public class TownCreateServiceImple
        implements TownCreateService {

    @Autowired
    private TownRepository townRepository;

    @Autowired
    private TalukaRepository talukaRepository;

    @Override
    public Town addData(Town town) {

        Taluka taluka =
                talukaRepository.findById(
                        town.getTaluka().getTalukaId())
                .orElse(null);

        town.setTaluka(taluka);

        return townRepository.save(town);
    }
}