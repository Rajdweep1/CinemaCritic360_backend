package com.app.movies_reviews_app.service;

import com.app.movies_reviews_app.dao.movieRepository;
import com.app.movies_reviews_app.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieService {
    @Autowired
    private movieRepository movieRepo;

    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }

    public String addMovie(Movie movie){
        movieRepo.save(movie);
        return "done";
    }
}
