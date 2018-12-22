package com.eShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MovieItem implements Serializable {


    private static final long serialVersionUID = 106700596399438872L;

    @Id
    @GeneratedValue
    private int movieItemId;

    @ManyToOne
    @JoinColumn(name = "movieCartId")
    @JsonIgnore
    private MovieCart movieCart;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;


    public MovieCart getMovieCart() {
        return movieCart;
    }

    public void setMovieCart(MovieCart movieCart) {
        this.movieCart = movieCart;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
