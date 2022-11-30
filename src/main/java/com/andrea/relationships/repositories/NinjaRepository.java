package com.andrea.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.andrea.relationships.models.License;

public interface NinjaRepository extends CrudRepository<License,Long> {
	
		List<License> findAll();
		

}
