package service1feign.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import service1feign.model.Book;
@Repository
public interface BookRepo extends CrudRepository<Book,Integer> {
}
