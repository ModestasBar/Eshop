package com.eShop.controller.admin;

import com.eShop.dao.MovieDao;
import com.eShop.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminHome {


    @Autowired
    private MovieDao movieDao;


    @RequestMapping()
    public String admin(){
        return "admin";
    }

    @RequestMapping("/movieInventory")
    public String movieInventory(Model model){

        List<Movie> movieList = movieDao.movieList();

        model.addAttribute("movieList", movieList);

        return "movieInventory";
    }

}
