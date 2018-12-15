package com.eShop.controller;

import com.eShop.model.Customer;
import com.eShop.services.CustomerService;
import com.eShop.services.MovieCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/cart")
public class MovieCartController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping
    private String getMovieCart(@AuthenticationPrincipal User activeUser){
        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
        int cartId = customer.getCustomerId();

        return "redirect:/customer/cart/" + cartId;
    }

    @RequestMapping("/{cartId}")
    public String getMovieCartRedirect(@PathVariable(value = "cartId") int cartId, Model model){
        model.addAttribute("cartId", cartId);

        return "movieCart";
    }

}
