package com.eShop.services;

import com.eShop.model.MovieCart;
import com.eShop.model.MovieItem;

public interface MovieCartService {

    MovieCart getMovieCartById(int movieCartId);
    void addMovieCartItem(MovieItem movieItem);
    void deleteMovieCartItem(MovieItem movieItem);
    MovieItem getMovieItemByMovieId(int movieId);
    void clearCart(MovieCart movieCart);
}
