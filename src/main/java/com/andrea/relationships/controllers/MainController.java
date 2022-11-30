package com.andrea.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.andrea.relationships.models.Person;
import com.andrea.relationships.services.DojoPersonService;

@Controller
public class MainController {
	@Autowired
	private DojoPersonService dojoServ;
	
	
	
	@GetMapping("/dojos/new")
	public String dojo(@ModelAttribute("dojo") Person person ) {
	return "NewDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo")Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "NewDojo.jsp";
		}
		this.dojoServ.createPerson(person);
		return "redirect:/ninja/new";
	}
	
	@GetMapping("/{id}")
	public String showDojo(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("dojo", this.dojoServ.find(id));
		return "PersonDetails.jsp";
		
	}
	

}
