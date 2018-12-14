package com.eShop.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class WatchList {

    @Id
    @GeneratedValue
    private int watchListId;

    @OneToOne

    private Customer customer;


    private ListMovie listMovie;


}
