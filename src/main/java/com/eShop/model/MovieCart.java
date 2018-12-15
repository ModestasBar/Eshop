package com.eShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class MovieCart implements Serializable {

    private static final long serialVersionUID = 3298414699307920458L;


    @Id
    @GeneratedValue
    private int movieCartId;

    @OneToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
    private Customer customer;


    @OneToMany(mappedBy = "movieCart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovieItem> movieItem;



    public int getMovieCartId() {
        return movieCartId;
    }

    public void setMovieCartId(int movieCartId) {
        this.movieCartId = movieCartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<MovieItem> getMovieItem() {
        return movieItem;
    }

    public void setMovieItem(List<MovieItem> movieItem) {
        this.movieItem = movieItem;
    }
}
