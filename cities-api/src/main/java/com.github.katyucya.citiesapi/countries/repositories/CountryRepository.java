package com.github.katyucya.countries.repositories;

import com.github.katyucya.countries.entities.Country;
mport org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}