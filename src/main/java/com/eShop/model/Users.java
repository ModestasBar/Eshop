package com.eShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private int userId;

    private String username;

    private String password;

    private boolean enabled;

}
