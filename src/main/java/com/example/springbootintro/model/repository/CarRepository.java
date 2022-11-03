package com.example.springbootintro.model.repository;

import com.example.springbootintro.model.entity.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {



}
