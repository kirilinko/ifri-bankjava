package bj.ifri.tpbank.repositories;

import java.util.List;
import bj.ifri.tpbank.entities.Client;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ClientRepository extends JpaRepository<Client, Long> {
  
	public List<Client> findByNomContainsIgnoreCase(String nom);
	public List<Client> findByPrenomContainsIgnoreCase(String prenom);
	public List<Client> findByAgenceNumeroagence(Long agenceNumeroagence);
	
	@Query(value ="SELECT * FROM Client ", nativeQuery = true)
	List <Client> findBankNumero();
	//@Query(value ="SELECT c FROM Client c INNER JOIN Compte co ON co.clientid=c.numero INNER JOIN Agence a ON a.numero=c.agenceid INNER JOIN Bank b ON b.numero= a.bankid WHERE co.solde < :montant AND b.numero= :bankid", nativeQuery = true)
	//List<Client> findBankNumero(@Param("bankid") Long bankid, @Param("montant") int montant );
    //SELECT * FROM Client INNER JOIN Compte ON Compte.clientid=Client.numeroclient INNER JOIN Agence ON Agence.numeroagence=Client.agenceid INNER JOIN Bank ON Bank.numerobank= Agence.bankid WHERE Compte.solde < :montant AND Bank.numerobank= :bankid"
}
