package com.kgisl.mockmvc.service;



import java.util.List;

import com.kgisl.mockmvc.model.Book;

public interface BookService {
    public Book createBook(Book book);
    public List<Book> getBooks();
    public Book findByBookId(Long id);
    public Book updateBook(Long id,Book book);
    public void deleteBookById(Long id); 
}