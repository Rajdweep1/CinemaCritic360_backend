package com.app.movies_reviews_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity(name = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private String imdbId;

    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<String> backdrops;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<String> genres;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<Review> reviews;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }

}
