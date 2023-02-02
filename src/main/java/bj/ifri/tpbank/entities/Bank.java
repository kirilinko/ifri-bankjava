package bj.ifri.tpbank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bank")
public class Bank {
    
	@Id
	@GeneratedValue
	private Long numerobank;
	
	@Column
	private float capitale;
	
	@Column
	private String nombanque;
	
	@Column
	private String adresseSiege;
	
	public float getCapitale() {
		return capitale;
	}
	public void setCapitale(float capitale) {
		this.capitale = capitale;
	}
	public String getAdresseSiege() {
		return adresseSiege;
	}
	public void setAdresseSiege(String adresseSiege) {
		this.adresseSiege = adresseSiege;
	}
	
	public String getNombanque() {
		return nombanque;
	}
	public void setNombanque(String nombanque) {
		this.nombanque = nombanque;
	}
	
	public Long getNumerobank() {
		return numerobank;
	}
	public void setNumerobank(Long numerobank) {
		this.numerobank = numerobank;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(float capitale, String nombanque, String adresseSiege) {
		super();
		this.capitale = capitale;
		this.nombanque = nombanque;
		this.adresseSiege = adresseSiege;
	}
	
	

}
