package com.eShop.controller;

import com.eShop.model.BillingAddress;
import com.eShop.model.Customer;
import com.eShop.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String customerRegister(Model model){
        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        customer.setBillingAddress(billingAddress);

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String customerRegisterPost(@ModelAttribute ("customer") Customer customer, Model model){

        customer.setEnabled(true);
        customerService.addCustomer(customer);

        return "customerRegisterSuccess";
    }
}
