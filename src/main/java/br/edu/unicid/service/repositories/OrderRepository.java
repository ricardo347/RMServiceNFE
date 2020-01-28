package br.edu.unicid.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicid.service.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
