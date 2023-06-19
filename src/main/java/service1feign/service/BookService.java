package service1feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service1feign.model.Book;
import service1feign.repo.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo repo;

    public Book book_method(Book book) {
        return repo.save(book);
    }
    public Book book_ids() {
        return (Book) repo.findAll();
    }
}
