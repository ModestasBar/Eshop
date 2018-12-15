package com.eShop.dao;

import com.eShop.model.Customer;

public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerByUsername(String username);
}
