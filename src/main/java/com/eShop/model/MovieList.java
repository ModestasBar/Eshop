package com.eShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class MovieList implements Serializable {

    private static final long serialVersionUID = 3298414699307920458L;


    @Id
    @GeneratedValue
    private int movieListId;

    @OneToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
    private Customer customer;


    @OneToMany(mappedBy = "movieList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovieItem> movieItem;

//    @OneToOne
//    private OrderList orderList;


}
