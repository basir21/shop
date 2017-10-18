/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductService {
    
    @PersistenceContext
    private EntityManager em;

    
    public ProductService() {
    }

    public ProductService(EntityManager em) {
        this.em = em;
    }

    
    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public List<Product> findAllProduct(){
        List<Product> product;
        product = this.em.createNamedQuery("Product.findAll").getResultList();
        return product;
    }
    
    public Product findId(int productid){
        return em.find(Product.class, productid);
    }
    
}
