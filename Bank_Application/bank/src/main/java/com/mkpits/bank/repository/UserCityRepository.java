package com.mkpits.bank.repository;

import com.mkpits.bank.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCityRepository extends JpaRepository<City,Integer> {
    public City findCityByName(String name);
}
