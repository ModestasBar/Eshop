package com.eShop.services.impl;

import com.eShop.dao.MovieDao;
import com.eShop.model.Movie;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    private MovieDao movieDao;

    public List<Movie> movieList() {
        return movieDao.movieList();
    }

    public Movie getMovieById(int movieId){
        return movieDao.getMovieById(movieId);
    }

    public void addMovie(Movie movie){
        movieDao.addMovie(movie);
    }

    public void deleteMovie(int movieId){
        movieDao.deleteMovie(movieId);
    }
}
