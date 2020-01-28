package br.edu.unicid.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicid.service.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
