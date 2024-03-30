package com.demo.example.core.impl;

import com.demo.example.core.Iterator;
import com.demo.example.domain.Book;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
    
}
