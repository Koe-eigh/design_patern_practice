package com.demo.example.product.impl;

import com.demo.example.product.api.Product;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ch) {
        this.ulchar = ch;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("* " + str + " *");
        for(int i = 0; i < length; i++) {
            System.out.print(this.ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
    
}
