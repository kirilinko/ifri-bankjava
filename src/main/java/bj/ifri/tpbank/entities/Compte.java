package bj.ifri.tpbank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {
	
	@Id
	@GeneratedValue
	private Long numerocompte;
	
	@Column
	private float solde;
	
	@Column
	private String dateouverture;
	
	@Column
	private boolean avecinterets;
	
	
	@ManyToOne()
	@JoinColumn(name = "clientid")
	private Client client;
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	 
	public Long getNumerocompte() {
		return numerocompte;
	}
	public void setNumerocompte(Long numerocompte) {
		this.numerocompte = numerocompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public String getDateouverture() {
		return dateouverture;
	}
	public void setDateouverture(String dateouverture) {
		this.dateouverture = dateouverture;
	}
	public boolean isAvecinterets() {
		return avecinterets;
	}
	public void setAvecinterets(boolean avecinterets) {
		this.avecinterets = avecinterets;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(float solde, String dateouverture, boolean avecinterets) {
		super();
		this.solde = solde;
		this.dateouverture = dateouverture;
		this.avecinterets = avecinterets;
	}
	 
	

}
