package com.eShop.dao.impl;

import com.eShop.dao.MovieCartDao;
import com.eShop.model.MovieCart;
import com.eShop.model.MovieItem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MovieCartDaoImpl implements MovieCartDao {

    @Autowired
    private SessionFactory sessionFactory;

    public MovieCart getMovieCartById(int movieCartId) {
        Session session = sessionFactory.getCurrentSession();
        return (MovieCart) session.get(MovieCart.class, movieCartId);
    }

    public void addMovieCartItem(MovieItem movieItem) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(movieItem);
        session.flush();
    }

    public void deleteMovieCartItem(MovieItem movieItem) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(movieItem);
        session.flush();
    }

    public MovieItem getMovieItemByMovieId(int movieId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From MovieItem where movieId=?");
        query.setInteger(0, movieId);

        session.flush();
        return (MovieItem) query.uniqueResult();
    }

    public void clearCart(MovieCart movieCart) {
        List<MovieItem> movieItemList = movieCart.getMovieItem();

        for (MovieItem movieItem : movieItemList) {
            deleteMovieCartItem(movieItem);
        }
    }
}
