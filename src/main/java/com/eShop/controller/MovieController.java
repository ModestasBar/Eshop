package com.eShop.controller;

import com.eShop.model.Movie;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movieList/{movieId}")
    public String getMovieInfo(@PathVariable("movieId") int movieId, Model model) {

        Movie movie = movieService.getMovieById(movieId);

        model.addAttribute("movie", movie);

        return "movieInfo";
    }

    @RequestMapping("/movieList")
    public String productList(Model model){

        List<Movie> movieList = movieService.movieList();

        model.addAttribute("movieList", movieList);

        return "movieList";
    }

}
