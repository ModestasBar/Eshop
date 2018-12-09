package com.eShop.dao;

import com.eShop.model.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> movieList();
    Movie getMovieById(int movieId);
    void addMovie(Movie movie);
}
