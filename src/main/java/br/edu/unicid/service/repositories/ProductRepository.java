package br.edu.unicid.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicid.service.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
