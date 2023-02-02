package bj.ifri.tpbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    
	@Id
	@GeneratedValue
	private Long numeroclient;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String adresse;
	
	@ManyToOne()
	
	@JoinColumn(name = "agenceid")
	private Agence agence;
	
	
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	 
	public Long getNumeroclient() {
		return numeroclient;
	}
	public void setNumeroclient(Long numeroclient) {
		this.numeroclient = numeroclient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	
	
	
}
