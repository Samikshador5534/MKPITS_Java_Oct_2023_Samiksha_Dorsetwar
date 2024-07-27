package com.mkpits.bank.repository;

import com.mkpits.bank.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDistrictRepository extends JpaRepository<District,Integer> {
    public   District findDistrictByName(String name);

}
