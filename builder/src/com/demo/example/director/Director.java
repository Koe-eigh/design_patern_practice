package com.demo.example.director;

import com.demo.example.builder.api.Builder;

public class Director {
    
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("In the daytime");
        builder.makeItems(new String[] {
            "good morning",
            "good afternoon"
        });
        builder.makeString("At night");
        builder.makeItems(new String[] {
            "good evening",
            "good night",
            "good bye"
        });
        builder.close();
    }
}