package com.demo.example;

import com.demo.example.concrete.IDcardFactory;
import com.demo.example.framework.Product;
import com.demo.example.framework.ProductFactory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = IDcardFactory.getInstance();
        Product card1 = factory.create("Ben");
        Product card2 = factory.create("Mark");
        card1.use();
        card2.use();
    }
}