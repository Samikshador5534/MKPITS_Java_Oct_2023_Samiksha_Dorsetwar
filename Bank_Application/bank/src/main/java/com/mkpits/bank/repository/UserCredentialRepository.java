package com.mkpits.bank.repository;

import com.mkpits.bank.model.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential ,Integer> {

    Optional<UserCredential> findByUserId(Long userId);
}
