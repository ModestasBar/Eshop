package com.eShop.services.impl;

import com.eShop.dao.MovieCartDao;
import com.eShop.model.MovieCart;
import com.eShop.model.MovieItem;
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

    public void addMovieCartItem(MovieItem movieItem){
        movieCartDao.addMovieCartItem(movieItem);
    }

    @Override
    public void deleteMovieCartItem(MovieItem movieItem) {
        movieCartDao.deleteMovieCartItem(movieItem);
    }

    public MovieItem getMovieItemByMovieId(int movieId){
        return movieCartDao.getMovieItemByMovieId(movieId);
    }

    @Override
    public void clearCart(MovieCart movieCart) {
        movieCartDao.clearCart(movieCart);
    }
}
