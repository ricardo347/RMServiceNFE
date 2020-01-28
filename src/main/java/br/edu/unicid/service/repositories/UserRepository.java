package br.edu.unicid.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicid.service.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
