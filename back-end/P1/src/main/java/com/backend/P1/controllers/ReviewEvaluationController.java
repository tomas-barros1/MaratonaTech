package com.backend.P1.controllers;

import com.backend.P1.entities.ReviewEvaluation;
import com.backend.P1.services.ReviewEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reviewEvaluations")
public class ReviewEvaluationController {
    @Autowired
    private ReviewEvaluationService reviewEvaluationService;

    @GetMapping
    public List<ReviewEvaluation> getAllReviewEvaluations() {
        return reviewEvaluationService.getAllReviewEvaluations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewEvaluation> getReviewEvaluationById(@PathVariable Long id) {
        return ResponseEntity.ok(reviewEvaluationService.getReviewEvaluationById(id));
    }
}
