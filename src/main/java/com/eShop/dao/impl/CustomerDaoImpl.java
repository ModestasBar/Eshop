package com.eShop.dao.impl;

import com.eShop.dao.CustomerDao;
import com.eShop.model.Authorities;
import com.eShop.model.Customer;

import com.eShop.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomer(Customer customer){
        Session session = sessionFactory.getCurrentSession();

        customer.getBillingAddress().setCustomer(customer);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(customer.getBillingAddress());

        Users users = new Users();
        users.setUsername(customer.getUsername());
        users.setPassword(customer.getPassword());
        users.setEnabled(true);
        users.setCustomerId(customer.getCustomerId());
        session.saveOrUpdate(users);

        Authorities authorities = new Authorities();
        authorities.setUsername(customer.getUsername());
        authorities.setAuthority("ROLE_USER");
        session.saveOrUpdate(authorities);


    }
}
