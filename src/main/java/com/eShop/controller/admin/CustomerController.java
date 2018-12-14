package com.eShop.controller.admin;

import com.eShop.model.BillingAddress;
import com.eShop.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/register")
    public String customerRegister(Model model){
        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCustomer(customer);
        customer.setBillingAddress(billingAddress);

        model.addAttribute("customer", customer);

        return "register";
    }
}
