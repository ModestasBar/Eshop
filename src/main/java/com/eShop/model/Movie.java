package com.eShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Movie implements Serializable {


    private static final long serialVersionUID = -1935978243166225988L;

    @Id
    @GeneratedValue
    private int movieId;


    @NotEmpty(message = "Movie name must not be empty")
    private String movieName;

    @NotEmpty(message = "Release date must not be empty")
    private String movieReleaseYear;

    private String movieType;

    private String movieIMDB;

    private String movieAbout;

    @NotEmpty(message = "Movie duration must not be empty")
    private String movieDuration;

    @Transient
    private MultipartFile movieImage;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<MovieItem> movieItem;

    public List<MovieItem> getMovieItem() {
        return movieItem;
    }

    public void setMovieItem(List<MovieItem> movieItem) {
        this.movieItem = movieItem;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public MultipartFile getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(MultipartFile movieImage) {
        this.movieImage = movieImage;
    }

    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }


    public String getMovieIMDB() {
        return movieIMDB;
    }

    public void setMovieIMDB(String movieIMDB) {
        this.movieIMDB = movieIMDB;
    }

    public String getMovieAbout() {
        return movieAbout;
    }

    public void setMovieAbout(String movieAbout) {
        this.movieAbout = movieAbout;
    }
}
