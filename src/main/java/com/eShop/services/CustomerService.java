package com.eShop.services;

import com.eShop.model.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerByUsername(String username);
}
