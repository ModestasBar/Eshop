package com.eShop.services;

import com.eShop.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> movieList();
    Movie getMovieById(int movieId);
    void addMovie(Movie movie);
    void deleteMovie(int movieId);
}
