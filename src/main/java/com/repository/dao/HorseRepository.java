package com.repository.dao;

import com.repository.entity.Horse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorseRepository extends JpaRepository<Horse, Integer> {

}
