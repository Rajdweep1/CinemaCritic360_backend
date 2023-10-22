package com.app.movies_reviews_app.dao;

import com.app.movies_reviews_app.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface movieRepository extends JpaRepository<Movie, String> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
