package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Diego
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
