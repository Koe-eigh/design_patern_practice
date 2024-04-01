package com.demo.example.builder.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.example.builder.api.Builder;

public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        this.filename = title + ".html";
        try {
            this.writer = new PrintWriter(new FileWriter(this.filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + title + "</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for(var item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }
    
}
