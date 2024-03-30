package com.demo.example;

import com.demo.example.core.Iterator;
import com.demo.example.core.impl.BookShelf;
import com.demo.example.domain.Book;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.append(new Book("Around the World in 80 days"));
        bookShelf.append(new Book("Bible"));
        bookShelf.append(new Book("Cinderella"));
        bookShelf.append(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
