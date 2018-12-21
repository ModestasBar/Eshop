package com.eShop.controller;

import com.eShop.model.Customer;
import com.eShop.model.Movie;
import com.eShop.model.MovieCart;
import com.eShop.model.MovieItem;
import com.eShop.services.CustomerService;
import com.eShop.services.MovieCartService;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rest/cart")
public class MovieCartResources {


    @Autowired
    private MovieCartService movieCartService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public @ResponseBody
    MovieCart getMovieCart(@PathVariable(value = "cartId") int cartId) {

        return movieCartService.getMovieCartById(cartId);
    }

    @RequestMapping(value = "/add/{movieId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable("movieId") int movieId, @AuthenticationPrincipal User activeUser) {
        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
        MovieCart movieCart = customer.getMovieCart();
        Movie movie = movieService.getMovieById(movieId);

        List<MovieItem> movieItemList = movieCart.getMovieItem();

        for (int i = 0; i < movieItemList.size(); i++) {
            if (movieItemList.get(i).getMovie().getMovieId() == movie.getMovieId()) {
                MovieItem movieItem = movieItemList.get(i);
                movieItem.setQuantity(movieItem.getQuantity() + 1);
                movieCartService.addMovieCartItem(movieItem);
                return;
            }
        }
        MovieItem movieItem = new MovieItem();
        movieItem.setQuantity(1);
        movieItem.setMovie(movie);
        movieItem.setMovieCart(movieCart);
        movieCartService.addMovieCartItem(movieItem);
    }

    @RequestMapping(value = "/remove/{movieId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable("movieId") int movieId) {
        MovieItem movieItem = movieCartService.getMovieItemByMovieId(movieId);
        movieCartService.deleteMovieCartItem(movieItem);
    }

    @RequestMapping( value = "/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void clearCart(@PathVariable("cartId") int cartId){
        MovieCart movieCart = movieCartService.getMovieCartById(cartId);
        movieCartService.clearCart(movieCart);
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegar request, please verify your payload")
    public void handleClientErrors(Exception e){}

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void handleServerErrors(Exception e){}

}
