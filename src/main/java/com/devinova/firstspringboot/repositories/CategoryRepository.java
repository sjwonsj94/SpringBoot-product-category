package com.devinova.firstspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import org.springframework.stereotype.Component;

import com.devinova.firstspringboot.entities.Category;

//@Component
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}


/*public static Map<Long, Category> map = new HashMap<>();
	
	public void save(Category category) {
		map.put(category.getId(), category);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}*/
