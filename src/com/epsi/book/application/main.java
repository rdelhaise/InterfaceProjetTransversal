package com.epsi.book.application;

import java.awt.EventQueue;

import com.epsi.book.application.metier.Book;
import com.epsi.book.application.presentation.Accueil;
import com.epsi.book.application.traitement.Bibliotheque;

public class main {
	public static void main(String[] args)   {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
}
