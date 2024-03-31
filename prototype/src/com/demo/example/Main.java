package com.demo.example;

import com.demo.example.manager.Manager;
import com.demo.example.product.api.Product;
import com.demo.example.product.impl.MessageBox;
import com.demo.example.product.impl.UnderlinePen;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox box = new MessageBox('-');
        UnderlinePen ul = new UnderlinePen('~');
        manager.register("box", box);
        manager.register("emphasis", ul);

        Product p1 = manager.create("box");
        p1.use("Hello World");
        Product p2 = manager.create("emphasis");
        p2.use("Hello World");
    }
    
}