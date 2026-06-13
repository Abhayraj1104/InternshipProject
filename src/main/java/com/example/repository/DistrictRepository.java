package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer>{

}
