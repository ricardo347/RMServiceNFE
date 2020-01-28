package br.edu.unicid.service.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.edu.unicid.service.entities.Order;
import br.edu.unicid.service.entities.User;
import br.edu.unicid.service.repositories.OrderRepository;
import br.edu.unicid.service.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired	
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		 
		User u1 = new User(null, "UserRPS1", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "UserRPS2", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	

}
