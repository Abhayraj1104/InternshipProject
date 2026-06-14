package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Town;

@Repository
public interface TownRepository extends JpaRepository<Town, Long>{

}
