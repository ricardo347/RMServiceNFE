package br.edu.unicid.service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unicid.service.entities.Product;
import br.edu.unicid.service.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	//when using spring dependency injection, it must register de component
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//value means, we're passing parameter id to GET
	//@PathVariable must do be add to method parameter
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
