package com.epsi.book.app.work;

import java.io.Serializable;

public class Author implements Serializable {
	private String nom;
	private String prenom;
	
	
	
	public Author() {
	}


	public Author(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return this.prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
}
