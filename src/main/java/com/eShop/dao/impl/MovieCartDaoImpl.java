package com.eShop.dao.impl;

import com.eShop.dao.MovieCartDao;
import com.eShop.model.MovieCart;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieCartDaoImpl implements MovieCartDao {

    @Autowired
    private SessionFactory sessionFactory;

    public MovieCart getMovieCartById(int movieCartId){
        Session session = sessionFactory.getCurrentSession();
        return (MovieCart) session.get(MovieCart.class, movieCartId);
    }
}
