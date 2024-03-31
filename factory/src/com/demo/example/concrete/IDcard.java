package com.demo.example.concrete;

import com.demo.example.framework.Product;

public class IDcard extends Product {

    private String owner;

    IDcard(String owner){
        System.out.println("register " + owner + "'s card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use " + owner + "'s card");
    }
    
    public String getOwner() {
        return owner;
    }
}
