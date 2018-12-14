package com.eShop.controller;

import com.eShop.model.Movie;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }


    @RequestMapping("/login")
    public String login(@RequestParam(value = "error",required = false) String error, @RequestParam(value="logout", required = false)String logout, Model model){

        if(error != null){
            model.addAttribute("error", "Invalid username or password");
        }
        if(logout != null){
            model.addAttribute("logout", "You logout successfully");
        }

        return "login";
    }
}
