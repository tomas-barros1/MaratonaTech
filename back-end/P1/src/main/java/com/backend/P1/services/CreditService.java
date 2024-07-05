package com.backend.P1.services;

import com.backend.P1.entities.Credit;
import com.backend.P1.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {
    @Autowired
    private CreditRepository creditRepository;

    public List<Credit> getAllCredits() {
        return creditRepository.findAll();
    }

    public Credit getCreditById(Long id) {
        return creditRepository.findById(id).orElseThrow(() -> new RuntimeException("Credit not found"));
    }
}
