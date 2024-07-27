package com.mkpits.bank.repository;

import com.mkpits.bank.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address ,Integer> {
    Optional<Address> findByUserId(int intExact);
}
