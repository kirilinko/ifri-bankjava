package bj.ifri.tpbank.controllers;

import java.util.Objects;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 

import bj.ifri.tpbank.repositories.ClientRepository;
import bj.ifri.tpbank.repositories.AgenceRepository;

@Controller
@RequestMapping(value = "/client")
public class WebClientController {
	
	
	@Autowired
	private ClientRepository clientRepo;
	
	@Autowired
	private AgenceRepository agenceRepo;
	
	@GetMapping("/list")
	public String  listeClient ( Model model) {
        
		model.addAttribute("clients", clientRepo.findAll());
		return "clients";
		 
	}
	
	
	@GetMapping("/agence")
	public String  clientAgence (@RequestParam(required=false,name="agenceid") Long agenceId, Model model) {
        
		
		model.addAttribute("agences", agenceRepo.findAll());
		
		if (!Objects.isNull(agenceId) && agenceId!=0) 
		{
			model.addAttribute("clients", clientRepo.findByAgenceNumeroagence(agenceId)); 
			}
		else {
			  model.addAttribute("clients", clientRepo.findAll()) ;
			 }
		
	//	if (!agenceRepo.existsById(agenceId)) {
		//	System.out.println("Not found Tutorial with id = " + agenceId);
		
		//    }
		
		return "clientagence";
		 
	}
	
 	 @GetMapping("/search")
 	public String searchClient (@RequestParam("type") String type, @RequestParam("valeur") String valeur, Model model ) {
		 
 		 if(type.equals("nom"))
 		 { 	 model.addAttribute("clients",clientRepo.findByNomContainsIgnoreCase(valeur)); }
 		 
 		 else if(type.equals("prenom")) 
 		 { model.addAttribute("clients",clientRepo.findByPrenomContainsIgnoreCase(valeur)); }
		 
		 
 		 return  "clients";
 	 }
	
	
	
	//  @GetMapping("/list/{bankid}/decouvert")
	//  public ResponseEntity<List<Compte>> listClientDecouvert (@PathVariable("bankid") Long bankid) {

//		  List<Compte> clients=compteRepo.findByClientAgenceBankNumerobankAndSoldeLessThan(bankid,0);
		  
//		 return new ResponseEntity<> ( clients, HttpStatus.OK);
//	 }

}
