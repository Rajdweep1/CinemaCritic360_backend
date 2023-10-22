package com.app.movies_reviews_app.controller;

import com.app.movies_reviews_app.entity.Review;
import com.app.movies_reviews_app.service.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/reviews")
public class reviewController {
    @Autowired
    private reviewService reviewSer;

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<>(reviewSer.addReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
