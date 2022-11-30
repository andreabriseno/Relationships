package com.andrea.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.andrea.relationships.models.License;
import com.andrea.relationships.models.Person;
import com.andrea.relationships.services.DojoPersonService;

@Controller
public class OtherController {
	@Autowired 
	private DojoPersonService dojoServ;
	
	@GetMapping("/ninja/new")
	public String ninja(@ModelAttribute("ninja")License license, Model viewModel) {
		List<Person> allPersons =this.dojoServ.allPersons();
		viewModel.addAttribute("allPersons",allPersons);
		return "NewNinja.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String createNinja(@Valid @ModelAttribute("ninja") License license, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			List<Person> allPersons =this.dojoServ.allPersons();
			viewModel.addAttribute("allPersons",allPersons);
			return "NewNinja.jsp";
		}
		this.dojoServ.createLicense(license);
		return "redirect:/dojo/" + license.getPerson().getId(); 
	}
		
}
