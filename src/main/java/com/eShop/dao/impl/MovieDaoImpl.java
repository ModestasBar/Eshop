package com.eShop.dao.impl;

import com.eShop.dao.MovieDao;
import com.eShop.model.Movie;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Movie> movieList(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Movie");
        List<Movie> movieList = query.list();
        session.flush();
        return movieList;
    }

    public Movie getMovieById(int movieId){
        Session session = sessionFactory.getCurrentSession();
        return (Movie) session.get(Movie.class, movieId);
    }

    public void addMovie(Movie movie){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(movie);
        session.flush();
    }

    public void deleteMovie(int movieId){
        Session session = sessionFactory.getCurrentSession();
        Movie movie = getMovieById(movieId);
        session.delete(movie);
        session.flush();
    }
}
