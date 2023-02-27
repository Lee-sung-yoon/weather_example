package com.example.weather_example.repository;

import com.example.weather_example.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {



}
