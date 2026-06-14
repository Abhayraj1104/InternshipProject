package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.COD;

@Repository
public interface CODRepository extends JpaRepository<COD, Long>{

}
