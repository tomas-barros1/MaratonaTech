package com.backend.P1.services;

import com.backend.P1.entities.ReviewEvaluation;
import com.backend.P1.repositories.ReviewEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewEvaluationService {
    @Autowired
    private ReviewEvaluationRepository reviewEvaluationRepository;

    public List<ReviewEvaluation> getAllReviewEvaluations() {
        return reviewEvaluationRepository.findAll();
    }

    public ReviewEvaluation getReviewEvaluationById(Long id) {
        return reviewEvaluationRepository.findById(id).orElseThrow(() -> new RuntimeException("ReviewEvaluation not found"));
    }
}
