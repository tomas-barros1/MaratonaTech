package com.backend.P1.services;

import com.backend.P1.entities.AcessToken;
import com.backend.P1.repositories.AcessTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessTokenService {
    @Autowired
    private AcessTokenRepository accessTokenRepository;

    public List<AcessToken> getAllAccessTokens() {
        return accessTokenRepository.findAll();
    }

    public AcessToken getAccessTokenById(Long id) {
        return accessTokenRepository.findById(id).orElseThrow(() -> new RuntimeException("AccessToken not found"));
    }
}
