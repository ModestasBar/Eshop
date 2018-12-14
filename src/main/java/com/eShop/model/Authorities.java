package com.eShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Authorities {

    @Id
    @GeneratedValue
    private int authorityId;

    private String username;

    private String authority;
}
