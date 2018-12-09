package com.eShop.controller.admin;

import com.eShop.dao.MovieDao;
import com.eShop.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/admin/movieInventory")
public class AdminMovie {


    @Autowired
    private MovieDao movieDao;


    @RequestMapping("/{movieId}")
    public String movieInformation(@PathVariable ("movieId") int movieId, Model model){

        Movie movie = movieDao.getMovieById(movieId);

        model.addAttribute("movie", movie);

        return "movieInfo";
    }

    @RequestMapping("/addMovie")
    public String addMovie(Model model){
        Movie movie = new Movie();
        movie.setMovieType("Action");
        movie.setMovieIMDB("<5");
        model.addAttribute("movie", movie);

        return "addMovie";
    }

    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public String addMoviePost(@ModelAttribute("movie") Movie movie){

        movieDao.addMovie(movie);

        return "redirect:/admin/movieInventory";
    }
}
