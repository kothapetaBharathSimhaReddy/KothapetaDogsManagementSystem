package com.kothapeta.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kothapeta.DMS.Models.Dog;


/*
 * @author Bharath Simha Reddy Kothapeta
 * 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
