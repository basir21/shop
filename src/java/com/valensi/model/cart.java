/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class cart {
    private List<Product> product;

    public cart() {
        product = new ArrayList<>();
    }

    /**
     * @return the product
     */
    public List<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    
    
}
