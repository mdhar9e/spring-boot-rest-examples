package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private com.sample.IProductService productService;

    //mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<com.sample.Product> getProduct() {
//finds all the products
        List<com.sample.Product> products = productService.findAll();
//returns the product list
        return products;
    }
}
