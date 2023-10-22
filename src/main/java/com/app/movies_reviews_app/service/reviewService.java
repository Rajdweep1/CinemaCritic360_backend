package com.app.movies_reviews_app.service;

import com.app.movies_reviews_app.dao.reviewRepository;
import com.app.movies_reviews_app.entity.Movie;
import com.app.movies_reviews_app.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class reviewService {
    @Autowired
    private reviewRepository reviewRepo;

    @Autowired
    private movieService movieSer;

    public Review addReview(String body, String imdbId){
        Review review = new Review(imdbId, body);
        Optional<Movie> obj = movieSer.singleMovie(imdbId);
        if(obj.isPresent()) {
            Movie movie = obj.get();
            List<Review> list = movie.getReviews();
            if(list == null) list = new ArrayList<>();
            list.add(review);
            movie.setReviews(list);
            movieSer.addMovie(movie);
            return review;
        }
        return null;
    }
}
