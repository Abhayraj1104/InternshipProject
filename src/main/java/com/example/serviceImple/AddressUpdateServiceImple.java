package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Country;
import com.example.entity.State;
import com.example.entity.District;
import com.example.entity.Taluka;
import com.example.entity.Town;

import com.example.repository.AddressRepository;
import com.example.repository.CountryRepository;
import com.example.repository.StateRepository;
import com.example.repository.DistrictRepository;
import com.example.repository.TalukaRepository;
import com.example.repository.TownRepository;

import com.example.service.AddressUpdateService;

@Service
public class AddressUpdateServiceImple
        implements AddressUpdateService {

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
    public Address updateData(Address address, int id) {

        Address existingAddress =
                addressRepository.findById(id)
                                 .orElse(null);

        if (existingAddress != null) {

            existingAddress.setArea(address.getArea());
            existingAddress.setStreet(address.getStreet());
            existingAddress.setPincode(address.getPincode());

            Country country =
                    countryRepository.findById(
                            address.getCountry().getCountryId())
                    .orElse(null);

            State state =
                    stateRepository.findById(
                            address.getState().getStateId())
                    .orElse(null);

            District district =
                    districtRepository.findById(
                            address.getDistrict().getDistrictId())
                    .orElse(null);

            Taluka taluka =
                    talukaRepository.findById(
                            address.getTaluka().getTalukaId())
                    .orElse(null);

            Town town =
                    townRepository.findById(
                            address.getTown().getTownId())
                    .orElse(null);

            existingAddress.setCountry(country);
            existingAddress.setState(state);
            existingAddress.setDistrict(district);
            existingAddress.setTaluka(taluka);
            existingAddress.setTown(town);

            return addressRepository.save(existingAddress);
        }

        return null;
    }
}