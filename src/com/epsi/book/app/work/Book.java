package com.epsi.book.app.work;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {

	private String id;
	private String isbn;
	private String titre;
	private String genre;
	private ArrayList<Author> Listauteur;
	private int annee;
	private boolean isBorrowed;
	
	
	//Constructeur d'un livre
	public Book(String id, String isbn,String genre, String titre, Author auteur, int annee) {
		this.id = id;
		this.isbn=isbn;
		this.titre = titre;
		this.Listauteur = new ArrayList<Author>();
		this.Listauteur.add(auteur);
		this.annee = annee;
		this.isBorrowed = false;
	}


public Book() {
	}


	//Cette fonction permet de vérifier si un livre est disponible
	public boolean isBorrowed() {
		return isBorrowed;
	}


//Cette fonction permet de mettre à jour la disponibilité d'un livre
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}


//Retourne l'Isbn d'un livre
	public String getIsbn() {
		return isbn;
	}
	
	



	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}


//Retourne la liste des auteurs
	public ArrayList<Author> getListAuteur() {
		return this.Listauteur;
	}
	
	//Retourne un auteur du livre
	public Author getAuteur(String nom, String prenom) {
		Author auteur= new Author();
		for (Author au:Listauteur) {
			if(au.getNom().equals(nom) && au.getPrenom().equals(prenom)) {
				auteur=au;
				break;
			}
		}
		return auteur;
	}


//Ajouter un auteur
	public void setAuteur(Author auteur) {
		this.Listauteur.add(auteur);
	}



	public int getAnnee() {
		return annee;
	}



	public void setAnnee(int annee) {
		this.annee = annee;
	}



	public String getId() {
		return id;
	}
	
	/**
	 * isEqualTo
	 * Cette fonction permet de verifier si 2 livres sont identiques
	 * @param b
	 * @return
	 */
	public boolean isEqualTo(Book b)
	{
		return this.id.equalsIgnoreCase(b.id) && this.isbn.equalsIgnoreCase(b.isbn) && this.titre.equalsIgnoreCase(b.titre) && this.annee == b.annee;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", titre=" + titre + ", genre=" + genre + ", Listauteur="
				+ Listauteur + ", annee=" + annee + ", isBorrowed=" + isBorrowed + "]";
	}
	
	
}
