package com.demo.example.core.impl;

import com.demo.example.core.Print;
import com.demo.example.domain.Banner;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
