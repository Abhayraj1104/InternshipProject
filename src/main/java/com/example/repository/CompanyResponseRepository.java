package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CompanyResponse;

@Repository
public interface CompanyResponseRepository extends JpaRepository<CompanyResponse, Integer>{

}
