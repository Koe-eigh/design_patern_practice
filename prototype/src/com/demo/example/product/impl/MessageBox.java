package com.demo.example.product.impl;

import com.demo.example.product.api.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char ch){
        this.decochar = ch;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        for(int i = 0; i < length; i++){
            System.out.print(this.decochar);
        }
        System.out.println("");
        System.out.println(this.decochar + " " + str + " " + this.decochar);
        for(int i = 0; i < length; i++){
            System.out.print(this.decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
