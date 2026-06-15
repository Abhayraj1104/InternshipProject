package com.example.serviceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.repository.AddressRepository;
import com.example.repository.CountryRepository;
import com.example.repository.DistrictRepository;
import com.example.repository.StateRepository;
import com.example.repository.TalukaRepository;
import com.example.repository.TownRepository;
import com.example.service.AddressCreateService;

@Service
public class AddressCreateServiceImple
        implements AddressCreateService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private TalukaRepository talukaRepository;

    @Autowired
    private TownRepository townRepository;

    @Override
    public Address addData(Address address) {

        address.setCountry(
            countryRepository.findById(
                address.getCountry().getCountryId()
            ).orElse(null)
        );

        address.setState(
            stateRepository.findById(
                address.getState().getStateId()
            ).orElse(null)
        );

        address.setDistrict(
            districtRepository.findById(
                address.getDistrict().getDistrictId()
            ).orElse(null)
        );

        address.setTaluka(
            talukaRepository.findById(
                address.getTaluka().getTalukaId()
            ).orElse(null)
        );

        address.setTown(
            townRepository.findById(
                address.getTown().getTownId()
            ).orElse(null)
        );

        return addressRepository.save(address);
    }
}