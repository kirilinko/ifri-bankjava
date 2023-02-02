package bj.ifri.tpbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.List;
import bj.ifri.tpbank.repositories.*;
import bj.ifri.tpbank.entities.Bank;
import bj.ifri.tpbank.entities.Agence;
import bj.ifri.tpbank.entities.Client;

@SpringBootApplication
@EnableAutoConfiguration
public class App 
{   
	@Autowired
	private AgenceRepository agenceRepo;
	
	@Autowired
	private BankRepository bankRepo;
	
	@Autowired
	private ClientRepository clientRepo;
	
	@Autowired
	private EmployeRepository employerRepo;
	
	@Autowired
	private CompteRepository compteRepo;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    
	//@Bean
 	//public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
 		//return args -> {
 			//## Création de la banque UBA
 		  //  Bank bank = new Bank(1520000, "UBA", "Avenue Stermez");
 		 //   Bank bankSaved = bankRepo.save(bank);
 
 		    //## Création d'une agence UBA
 		//    Agence agence = new Agence("En face de la mairie, Lot 72","Abomey Calavi","01PB2663","Olivier Kant");
 		//    agence.setBank(bankSaved);
 		//    agenceRepo.save(agence);
 		    
 		//    Client client=new Client("Franck","da COSTA","Calavi");
 		//    client.setAgence(agence);
 		//    clientRepo.save(client);
 		    
	   //## Création de la banque Ecobank
 		//    Bank bank2 = new Bank(1965700, "Ecobank", "Correfour des trois Banques");
 		//    Bank bankSaved1 = bankRepo.save(bank2);

 		//	System.out.println(bankRepo.findAll());
 	//		System.out.println(agenceRepo.findAll());
 //
 	//	};
 	//}
    
    
}
