package com.devinova.firstspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devinova.firstspringboot.entities.Product;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;


public interface ProductRepository extends JpaRepository<Product, Long>{
		
	}

	


/*public static Map<Long, Product> map = new HashMap<>();
	
	public void save(Product Product) {
		map.put(Product.getId(), Product);
	}
	
	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll(){
		return new ArrayList<Product>(map.values());*/