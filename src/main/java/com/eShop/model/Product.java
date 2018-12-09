package com.eShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {


    private static final long serialVersionUID = -1935978243166225988L;

    @Id
    @GeneratedValue
    private int productId;

    private String movieName;

    private String movieReleaseYear;

    private int movieType;

    private String moviePrice;

    private String movieIMDB;

    private String movieAbout;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public int getMovieType() {
        return movieType;
    }

    public void setMovieType(int movieType) {
        this.movieType = movieType;
    }

    public String getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(String moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getMovieIMDB() {
        return movieIMDB;
    }

    public void setMovieIMDB(String movieIMDB) {
        this.movieIMDB = movieIMDB;
    }

    public String getMovieAbout() {
        return movieAbout;
    }

    public void setMovieAbout(String movieAbout) {
        this.movieAbout = movieAbout;
    }
}
