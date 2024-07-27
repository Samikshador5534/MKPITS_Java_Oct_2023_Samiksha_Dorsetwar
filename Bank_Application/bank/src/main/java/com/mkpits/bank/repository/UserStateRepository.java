package com.mkpits.bank.repository;

import com.mkpits.bank.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserStateRepository extends JpaRepository<State,Integer> {
    public State findStateByName(String name);
}
