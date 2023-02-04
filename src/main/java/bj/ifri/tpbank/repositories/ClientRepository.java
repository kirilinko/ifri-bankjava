package bj.ifri.tpbank.repositories;

import java.util.List;
import bj.ifri.tpbank.entities.Client;


import org.springframework.data.jpa.repository.JpaRepository;




public interface ClientRepository extends JpaRepository<Client, Long> {
  
	public List<Client> findByNomContainsIgnoreCase(String nom);
	public List<Client> findByPrenomContainsIgnoreCase(String prenom);
	public List<Client> findByAgenceNumeroagence(Long agenceNumeroagence);
	
	 
}
