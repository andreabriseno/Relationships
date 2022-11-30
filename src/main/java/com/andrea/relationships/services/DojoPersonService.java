package com.andrea.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrea.relationships.models.License;
import com.andrea.relationships.models.Person;
import com.andrea.relationships.repositories.DojoRepository;
import com.andrea.relationships.repositories.NinjaRepository;

@Service
public class DojoPersonService {
	@Autowired
	private DojoRepository peRepo;
	
	@Autowired
	private NinjaRepository liRepo;
	
	public Person createPerson(Person dojo) {
		return this.peRepo.save(dojo);
	}
	
	public List<Person> allPersons(){
		return this.peRepo.findAll();
	}
	
	public Person find(Long id) {
		Optional<Person> result = peRepo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		else {
			return null;
			
		}
	}
	
	public License createLicense(License ninja) {
		return this.liRepo.save(ninja);
	}
	
	

}
