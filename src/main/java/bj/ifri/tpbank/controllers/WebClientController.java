package bj.ifri.tpbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import bj.ifri.tpbank.entities.*;
import bj.ifri.tpbank.repositories.*;


@RestController
@RequestMapping(value = "/client")
public class WebClientController {
	
	@Autowired
	private AgenceRepository agenceRepo;
	
	@Autowired
	private ClientRepository clientRepo;
	
	@Autowired
	private CompteRepository compteRepo;
	
	@GetMapping("/list/{agenceId}")
	public ResponseEntity<List<Client>> findClientByAgenceId (@PathVariable("agenceId") Long agenceId) {
        
		if (!agenceRepo.existsById(agenceId)) {
			System.out.println("Not found Tutorial with id = " + agenceId);
		
		    }
		
		List<Client> clients=clientRepo.findByAgenceNumeroagence(agenceId);
	   
		return new ResponseEntity<> ( clients, HttpStatus.OK);
		 
	}
	
	 @GetMapping("/search/{type}/{valeur}")
	 public ResponseEntity<List<Client>> searchClient (@PathVariable("type") String type, @PathVariable("valeur") String valeur) {
		 
		 List<Client> clients=null;
		
		 if(type.equals("nom")) { clients=clientRepo.findByNomContainsIgnoreCase(valeur);}
		 
		 if(type.equals("prenom")) {clients=clientRepo.findByPrenomContainsIgnoreCase(valeur);}
		 
		 
		 return new ResponseEntity<> ( clients, HttpStatus.OK);
	 }
	
	
	
	  @GetMapping("/list/{bankid}/decouvert")
	  public ResponseEntity<List<Compte>> listClientDecouvert (@PathVariable("bankid") Long bankid) {

		  List<Compte> clients=compteRepo.findByClientAgenceBankNumerobankAndSoldeLessThan(bankid,0);
		  
		 return new ResponseEntity<> ( clients, HttpStatus.OK);
	 }

}
