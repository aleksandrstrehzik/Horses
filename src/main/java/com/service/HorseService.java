package com.service;

import com.repository.dao.HorseRepository;
import com.repository.entity.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseService {

    private final HorseRepository horseRepository;

    @Autowired
    public HorseService(HorseRepository horseRepository) {
        this.horseRepository = horseRepository;
    }

    public List<Horse> findAll() {
        return horseRepository.findAll();
    }

    public Horse findById(Integer id) {
        return horseRepository.getReferenceById(id);
    }

    public void createHorse(Horse horse) {
        horseRepository.save(horse);
    }

    public void deleteById(Integer id) {
        horseRepository.deleteById(id);
    }
}
