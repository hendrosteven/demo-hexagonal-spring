package demo.hexagonal.repository.impl;

import java.util.ArrayList;
import java.util.List;

import demo.hexagonal.domain.Book;
import demo.hexagonal.repository.BookRepository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private List<Book> books = new ArrayList<>();

    @Override
    public void createOneBook(Book book) {
        this.books.add(book);
    }

    @Override
    public Book findOneById(Long id) {
        Book result = books.stream()
            .filter(book -> book.getId() == id)
            .findAny()
            .orElse(null);
        return result;
    }

    @Override
    public List<Book> findAllBook() {
        return this.books;
    }

}
