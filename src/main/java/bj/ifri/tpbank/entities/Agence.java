package bj.ifri.tpbank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "agence")
public class Agence {
    
	@Id
	@GeneratedValue
	private Long numeroagence;
	
	@Column
	private String adresseag;
	
	@Column
	private String ville;
	
	@Column
	private String codepostal;
	
	@Column
	private String nomdirecteur;
	
	@ManyToOne()
	@JoinColumn(name = "bankid")
	private Bank bank;
	
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
    
	
	public Long getNumeroagence() {
		return numeroagence;
	}
	public void setNumeroagence(Long numeroagence) {
		this.numeroagence = numeroagence;
	}
	public String getAdresseag() {
		return adresseag;
	}
	public void setAdresse(String adresse) {
		this.adresseag = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getNomdirecteur() {
		return nomdirecteur;
	}
	public void setNomdirecteur(String nomdirecteur) {
		this.nomdirecteur = nomdirecteur;
	}
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agence(String adresseag, String ville, String codepostal, String nomdirecteur) {
		super();
		this.adresseag = adresseag;
		this.ville = ville;
		this.codepostal = codepostal;
		this.nomdirecteur = nomdirecteur;
	}
	
	
	
}
