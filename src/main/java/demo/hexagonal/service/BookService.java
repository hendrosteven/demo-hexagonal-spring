package demo.hexagonal.service;

import java.util.List;

import demo.hexagonal.domain.Book;

public interface BookService {
    void createOne(Book book);

    Book findOne(Long id);

    List<Book> findAll();
}
