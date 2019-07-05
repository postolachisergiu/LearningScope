package com.oca.building;

import com.oca.library.Book;

class House {
    Book book;

    House() {
    Book book = new Book();
    String value = book.isbn;
    book.printBook();
    }
}
