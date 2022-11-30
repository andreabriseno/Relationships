package com.andrea.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.andrea.relationships.models.Person;

public interface DojoRepository extends CrudRepository<Person, Long> {
	
	List<Person> findAll();
	
	

}
