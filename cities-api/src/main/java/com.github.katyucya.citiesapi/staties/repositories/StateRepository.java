package com.github.katyucya.staties.repositories;

import com.github.katyucya.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}