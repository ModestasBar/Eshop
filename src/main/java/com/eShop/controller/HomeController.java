package com.eShop.controller;

import com.eShop.model.Movie;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/movieList")
    public String productList(Model model){

        List<Movie> movieList = movieService.movieList();

        model.addAttribute("movieList", movieList);

        return "movieList";
    }
}
