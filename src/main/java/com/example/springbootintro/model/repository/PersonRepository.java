package com.example.springbootintro.model.repository;

import com.example.springbootintro.model.entity.model.CarEntity;
import com.example.springbootintro.model.entity.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    List<PersonEntity> findByName(String name);

    List<PersonEntity> findByNameAndAgeAndCar(String name, Integer age, CarEntity car);

    Boolean existsByIdAndNameAndCarIsNull(Long id, String name);

    List<PersonEntity> findDistinctByIdAndNameAndCarIsNull(Long id, String name);

    Long countAllById(Long id);

    @Query(
            value = "select count(*) from person",
            nativeQuery = true
    )
    Long selectByNativeQuery();

}
