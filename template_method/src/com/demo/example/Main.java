package com.demo.example;

import com.demo.example.domain.AbstractDisplay;
import com.demo.example.domain.concrete.CharDisplay;
import com.demo.example.domain.concrete.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('A');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();
    }
}
