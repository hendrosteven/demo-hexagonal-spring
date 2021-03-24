package demo.hexagonal.service.impl;

import java.util.List;

import demo.hexagonal.domain.Book;
import demo.hexagonal.repository.BookRepository;
import demo.hexagonal.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;;

    @Override
    public void createOne(Book book) {
        bookRepository.createOneBook(book);
    }

    @Override
    public Book findOne(Long id) {
        return bookRepository.findOneById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAllBook();
    }
    
}
