package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Tracking;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Integer>{

}
