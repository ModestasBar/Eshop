package com.eShop.dao;

import com.eShop.model.MovieCart;
import com.eShop.model.MovieItem;

public interface MovieCartDao {

    MovieCart getMovieCartById(int movieCartId);
    void addMovieCartItem(MovieItem movieItem);
    void deleteMovieCartItem(MovieItem movieItem);
    MovieItem getMovieItemByMovieId(int movieId);
    void clearCart(MovieCart movieCart);
}
