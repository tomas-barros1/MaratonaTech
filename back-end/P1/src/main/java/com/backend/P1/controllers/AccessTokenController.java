package com.backend.P1.controllers;

import com.backend.P1.entities.AcessToken;
import com.backend.P1.services.AcessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tokens")
public class AccessTokenController {
    @Autowired
    private AcessTokenService accessTokenService;

    @GetMapping
    public List<AcessToken> getAllAccessTokens() {
        return accessTokenService.getAllAccessTokens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcessToken> getAccessTokenById(@PathVariable Long id) {
        return ResponseEntity.ok(accessTokenService.getAccessTokenById(id));
    }
}
