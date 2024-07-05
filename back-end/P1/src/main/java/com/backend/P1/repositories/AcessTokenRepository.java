package com.backend.P1.repositories;

import com.backend.P1.entities.AcessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessTokenRepository extends JpaRepository<AcessToken, Long> {
}
