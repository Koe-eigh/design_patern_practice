package com.demo.example;

import com.demo.example.builder.impl.HTMLBuilder;
import com.demo.example.builder.impl.TextBuilder;
import com.demo.example.director.Director;

public class Main {
    public static void main(String[] args) {
        try {
            run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run(String[] args) throws Exception {
        if(args.length != 1) {
            throw new IndexOutOfBoundsException("the args' length has to be 1");
        }
        if(args[0].equals("plain")) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        } else if(args[0].equals("html")) {
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);
            director.construct();
            String filename = builder.getResult();
            System.out.println(filename + "was created");
        } else {
            throw new IllegalArgumentException("Illegal args was given. Acceptable args are 'plain' or 'html'.");
        }
    }
}
