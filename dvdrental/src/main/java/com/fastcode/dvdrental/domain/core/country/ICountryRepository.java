package com.fastcode.dvdrental.domain.core.country;

import java.time.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository("countryRepository")
public interface ICountryRepository
    extends JpaRepository<CountryEntity, Integer>, QuerydslPredicateExecutor<CountryEntity> {}
