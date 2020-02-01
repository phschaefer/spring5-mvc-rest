package de.phschaefer.spring5mvcrest.repositories;

import de.phschaefer.spring5mvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}