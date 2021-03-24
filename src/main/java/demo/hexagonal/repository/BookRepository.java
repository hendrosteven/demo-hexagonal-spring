package demo.hexagonal.repository;

import java.util.List;

import demo.hexagonal.domain.Book;

public interface BookRepository {
    void createOneBook(Book book);
    Book findOneById(Long id);
    List<Book> findAllBook();
}
