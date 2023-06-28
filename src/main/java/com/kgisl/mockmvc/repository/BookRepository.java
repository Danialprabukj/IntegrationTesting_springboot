package com.kgisl.mockmvc.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.mockmvc.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
    
}
