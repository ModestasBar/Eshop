package com.eShop.services.impl;

import com.eShop.dao.MovieCartDao;
import com.eShop.model.MovieCart;
import com.eShop.services.MovieCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieCartServiceImp implements MovieCartService {

    @Autowired
    private MovieCartDao movieCartDao;

    public MovieCart getMovieCartById(int movieCartId) {
        return movieCartDao.getMovieCartById(movieCartId);
    }
}
