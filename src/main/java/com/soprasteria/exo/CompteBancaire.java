package com.soprasteria.exo;

import java.time.LocalDate;

public class CompteBancaire {
	private int numCompte;
	private String nomPropriétaire;
	private double solde;
	private LocalDate dateCréation;
	private String typeCompte;
	
	public CompteBancaire(int numCompte, String nomPropriétaire, double solde, LocalDate dateCréation,
			String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.nomPropriétaire = nomPropriétaire;
		this.solde = solde;
		this.dateCréation = dateCréation;
		this.typeCompte = typeCompte;
	}
	//constructeur sans arguments

	public CompteBancaire()
	 {
		super();
		this.numCompte = 0;
		this.nomPropriétaire = " ";
		this.solde = 0.0;
		this.dateCréation = LocalDate.now();
		this.typeCompte = " ";
	}


	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public String getNomPropriétaire() {
		return nomPropriétaire;
	}

	public void setNomPropriétaire(String nomPropriétaire) {
		this.nomPropriétaire = nomPropriétaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public LocalDate getDateCréation() {
		return dateCréation;
	}

	public void setDateCréation(LocalDate dateCréation) {
		this.dateCréation = dateCréation;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", nomPropriétaire=" + nomPropriétaire + ", solde=" + solde
				+ ", dateCréation=" + dateCréation + ", typeCompte=" + typeCompte + "]";
	}
	
	
}
