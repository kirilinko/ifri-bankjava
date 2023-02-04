package bj.ifri.tpbank.repositories;

import bj.ifri.tpbank.entities.Compte;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
   
	public List<Compte> findByClientAgenceBankNumerobankAndSoldeLessThan(Long numerobank, float momntant);
	public List<Compte> findBySoldeLessThan(float montant);
}
