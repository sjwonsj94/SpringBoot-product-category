package com.devinova.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devinova.firstspringboot.entities.Category;
import com.devinova.firstspringboot.repositories.CategoryRepository;

@SpringBootApplication
public class FirstspringbootApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 = new Category(1L,"Eletronics");
		Category cat2 = new Category(2L,"Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
