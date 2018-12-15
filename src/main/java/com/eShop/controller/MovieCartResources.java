package com.eShop.controller;

import com.eShop.model.MovieCart;
import com.eShop.services.MovieCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/cart")
public class MovieCartResources {


    @Autowired
    private MovieCartService movieCartService;

    @RequestMapping("/{cartId}")
    public @ResponseBody
    MovieCart getMovieCart(@PathVariable(value = "cartId") int cartId){

        return movieCartService.getMovieCartById(cartId);
    }

}
