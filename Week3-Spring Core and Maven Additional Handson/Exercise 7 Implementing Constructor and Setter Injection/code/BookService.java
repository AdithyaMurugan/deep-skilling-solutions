package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String systemName;

    // Constructor for systemName (Constructor Injection)
    public BookService(String systemName) {
        this.systemName = systemName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("[" + systemName + "] BookService: Adding book...");
        bookRepository.saveBook(title);
    }
}
