package in.prashantpatil.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.prashantpatil.onlinebookstore.entity.Book;

@RepositoryRestResource(collectionResourceRel ="bookCategory",path = "book")
public interface BookRepository extends JpaRepository<Book, Long>{

}
