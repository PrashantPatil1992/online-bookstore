package in.prashantpatil.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prashantpatil.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
