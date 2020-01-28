package br.edu.unicid.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicid.service.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
