package com.app.movies_reviews_app.dao;

import com.app.movies_reviews_app.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepository extends JpaRepository<Review, String> {
}
