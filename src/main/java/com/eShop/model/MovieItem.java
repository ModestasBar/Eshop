package com.eShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class MovieItem implements Serializable {


    private static final long serialVersionUID = 106700596399438872L;

    @Id
    @GeneratedValue
    private int movieItemId;

    @ManyToOne
    @JoinColumn(name = "movieListId")
    @JsonIgnore
    private MovieList movieList;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;
}
