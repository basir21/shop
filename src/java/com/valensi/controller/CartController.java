/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("products/cart")
@SessionAttributes("p")
public class CartController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping(value="/{productId}")
    public String cartUser(HttpSession session, @PathVariable Integer productId, Model model){

        Product product = ps.findId(productId);
        model.addAttribute("product", product);
        List<Product> p = new ArrayList<>();
        if (p != null) {
            for (Product product1 : p) {
                product1.getDescription();
                product1.getPurchaseCost();
                p.add(product1);
                session.setAttribute("p", p);
            }
        }else {
            
            p.add(product);
            session.setAttribute("p", p);
        }
        return "cartuser";
    }
    
    @RequestMapping(value="/allcart")
    public String cart(HttpSession session, Model model){
        
        List<Product> pd = (List<Product>) session.getAttribute("p");
        
//        List<Product> product = new ArrayList<>();
//        product.add(pd);
//        session.setAttribute("p", product);
        return "allcart";
    }
    
    
}
