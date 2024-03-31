package com.demo.example.concrete;

import java.util.ArrayList;
import java.util.List;

import com.demo.example.framework.Product;
import com.demo.example.framework.ProductFactory;

public class IDcardFactory extends ProductFactory {

    private static IDcardFactory factory;
    private List<String> owners = new ArrayList<>();

    private IDcardFactory(){}

    @Override
    protected Product createProduct(String owner) {
        return new IDcard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDcard)p).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }

    public static IDcardFactory getInstance(){
        if(factory == null){
            factory = new IDcardFactory();
        }
        return factory;
    }
    
}
