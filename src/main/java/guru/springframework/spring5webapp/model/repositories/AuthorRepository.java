package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Diego
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
