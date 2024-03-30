package com.demo.example.domain.concrete;

import com.demo.example.domain.AbstractDisplay;

public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
    
}
