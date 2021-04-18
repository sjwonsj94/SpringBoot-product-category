package com.devinova.firstspringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devinova.firstspringboot.entities.Category;
import com.devinova.firstspringboot.entities.Product;
import com.devinova.firstspringboot.repositories.CategoryRepository;
import com.devinova.firstspringboot.repositories.ProductRepository;

@SpringBootApplication
public class FirstspringbootApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 = new Category(1L,"Eletronics");
		Category cat2 = new Category(2L,"Books");
		
		Product p1 = new Product(1L,"TV",2250.99,cat1);
		Product p2 = new Product(2L,"Rise of Rings",99.90,cat2);
		Product p3 = new Product(3L,"PS5",3500.00,cat1);
		Product p4 = new Product(4L,"UML 2.0",69.90,cat2);
		
		
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
		cat1.getProducts().addAll(Arrays.asList(p1,p3));
		cat2.getProducts().addAll(Arrays.asList(p2,p4));
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}
	

}
