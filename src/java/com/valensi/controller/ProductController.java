/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Product;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping(value="/all")
    public String showProduct(Model model){
        
        List<Product> products = ps.findAllProduct();
        model.addAttribute("products", products);
        return "product";
    }
    
    @RequestMapping(value="/{productId}")
    public String showCustomer(@PathVariable Integer productId, Model model){
        Product product = ps.findId(productId);
        model.addAttribute("product", product);
        return "productdetail";
    }
}
