package com.epsi.book.app.exception;

public class AllBooksAlreadyReturnedException extends Exception {

	public AllBooksAlreadyReturnedException() {
		System.out.println("Tous les livres avec l'identifiant donné sont déjà retourné");
	}
}
