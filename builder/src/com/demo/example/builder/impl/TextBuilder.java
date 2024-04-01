package com.demo.example.builder.impl;

import com.demo.example.builder.api.Builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer;

    public TextBuilder() {
        this.buffer = new StringBuffer();
    }

    @Override
    public void makeTitle(String title) {
        buffer.append("------------------------\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("*" + str +  "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(var item : items) {
            buffer.append(" ." + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("------------------------\n");
    }

    public String getResult() {
        return buffer.toString();
    }
    
}
