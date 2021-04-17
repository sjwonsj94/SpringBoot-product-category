package com.devinova.firstspringboot.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devinova.firstspringboot.entities.Category;

@Component
public class CategoryRepository {

	public static Map<Long, Category> map = new HashMap<>();
	
	public void save(Category category) {
		map.put(category.getId(), category);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}
}
