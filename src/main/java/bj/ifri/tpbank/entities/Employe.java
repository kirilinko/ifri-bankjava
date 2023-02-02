package bj.ifri.tpbank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employe")
public class Employe {
  
  @Id
  @GeneratedValue
  private String id;
  
  @Column
  private String nom;
  
  @Column
  private String prenom;
  
  @Column
  private String adresse;
  
  @Column
  private float salaire;
  
  @Column
  private int numinsee;
  
  @ManyToOne()
  @JoinColumn(name = "agenceid")
  private Agence agence;


public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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
public float getSalaire() {
	return salaire;
}
public void setSalaire(float salaire) {
	this.salaire = salaire;
}
public int getNuminsee() {
	return numinsee;
}
public void setNuminsee(int numinsee) {
	this.numinsee = numinsee;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public Employe(String nom, String prenom, String adresse, float salaire, int numinsee) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.salaire = salaire;
	this.numinsee = numinsee;
}
  

  
}
