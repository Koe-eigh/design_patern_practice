package com.demo.example.manager;

import java.util.HashMap;
import java.util.Map;

import com.demo.example.product.api.Product;

public class Manager {

    private Map<String, Product> showcase;

    public Manager(){
        this.showcase = new HashMap<>();
    }

    public void register(String str, Product p){
        this.showcase.put(str, p);
    }

    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
