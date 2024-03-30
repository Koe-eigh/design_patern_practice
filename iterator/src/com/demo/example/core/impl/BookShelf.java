package com.demo.example.core.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.example.core.Aggregate;
import com.demo.example.core.Iterator;
import com.demo.example.domain.Book;

public class BookShelf implements Aggregate{

    private List<Book> books;

    public BookShelf(){
        this.books = new ArrayList<>();
    }

    public void append(Book book){
        this.books.add(book);
    }

    public Book getBookAt(int index){
        return this.books.get(index);
    }

    public int getLength(){
        return this.books.size();
    }
    
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
    
}
