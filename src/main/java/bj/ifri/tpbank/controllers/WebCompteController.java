package bj.ifri.tpbank.controllers;

import org.springframework.ui.Model;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import bj.ifri.tpbank.repositories.CompteRepository;
import bj.ifri.tpbank.repositories.BankRepository;

@Controller
@RequestMapping(value = "/compte")
public class WebCompteController {
	
	@Autowired
	private CompteRepository compteRepo;
	
	@Autowired
	private BankRepository bankRepo;
	
	@GetMapping("/client/decouvert")
	public String  listeClientDecouvert (@RequestParam(required=false,name="banqueid") Long banqueid, Model model) {
        
		model.addAttribute("banques", bankRepo.findAll());
	 	if ( !Objects.isNull(banqueid) && banqueid!=0) 
	 	{
			model.addAttribute("comptes", compteRepo.findByClientAgenceBankNumerobankAndSoldeLessThan(banqueid, 0) );
		 	}
		 else {
		 	  model.addAttribute("comptes", compteRepo.findBySoldeLessThan(0) ) ;
		 	 }
		
		return "clientdecouvert";
		 
	}
	

}
