package com.demo.example;

import com.demo.example.core.Print;
import com.demo.example.core.impl.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}