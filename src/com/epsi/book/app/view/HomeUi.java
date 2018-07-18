package com.epsi.book.app.view ;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.epsi.book.app.action.LibraryBook;
import com.epsi.book.app.dao.GoogleBookDAO;
import com.epsi.book.app.work.Book;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class HomeUi extends JFrame {

	private JPanel contentPane;

	private static LibraryBook biblio;

	/**
	 * Launch the application.
	 * @throws JSONException 
	 */
	


	/**
	 * Create the frame on the start of application
	 */
	public HomeUi(Boolean prod) {
		if(prod == true) {
			try {
				biblio= LibraryBook.getInstance();
				
			
				
				biblio.addBook("AZT-RTE");
				biblio.addBook("AZT-RTE");
				for(Book b:biblio.getBooks()) {
					System.out.println(b.toString());
				}
				HomeUi frame = new HomeUi();
				frame.setVisible(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	public HomeUi() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DE LA BIBLIOTHEQUE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 542, 20);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel);
		
		JButton btnAjouterLivre = new JButton("Ajouter Livre");
		btnAjouterLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBookUi fen= new AddBookUi();
				fen.setVisible(true);
				setVisible(false);
				
			}
		});
		btnAjouterLivre.setBounds(200, 61, 147, 29);
		contentPane.add(btnAjouterLivre);
		
		JButton btnAjouterLivreAvec = new JButton("Ajouter Livre avec ISBN");
		btnAjouterLivreAvec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBookIsbnUi fen= new AddBookIsbnUi();
				fen.setVisible(true);
				setVisible(false);
			}
		});
		btnAjouterLivreAvec.setBounds(187, 116, 171, 29);
		contentPane.add(btnAjouterLivreAvec);
		
		JButton btnSupprimerLivre = new JButton("Retirer Livre");
		btnSupprimerLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetBookUi fen= new GetBookUi();
				fen.setVisible(true);
				setVisible(false);
			}
		});
		btnSupprimerLivre.setBounds(200, 198, 147, 29);
		contentPane.add(btnSupprimerLivre);
		
		JButton btnRetournerLivres = new JButton("Retourner Livre");
		btnRetournerLivres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBookUi fen= new ReturnBookUi();
				fen.setVisible(true);
				setVisible(false);
			}
		});
		btnRetournerLivres.setBounds(200, 239, 153, 29);
		contentPane.add(btnRetournerLivres);
		
		JButton btnRechercherLivre = new JButton("Rechercher Livre");
		btnRechercherLivre.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				SearchBookUi fenetreRechercher = null;
				try {
					fenetreRechercher = new SearchBookUi();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				fenetreRechercher.setVisible(true);
				setVisible(false);
			}
		});
		btnRechercherLivre.setBounds(200, 157, 147, 29);
		contentPane.add(btnRechercherLivre);
		
		JButton btnListerLesLivres = new JButton("Lister les Livres");
		btnListerLesLivres.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e)
			{
				ListBookDispUi fen= new ListBookDispUi();
				fen.setVisible(true);
				setVisible(false);
				
			}
		});
		btnListerLesLivres.setBounds(200, 281, 153, 29);
		contentPane.add(btnListerLesLivres);
		
		JButton btnListerLesLivres_1 = new JButton("Lister les Livres empruntés");
		btnListerLesLivres_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListBookNoDispUi fen= new ListBookNoDispUi();
				fen.setVisible(true);
				setVisible(false);
			}
		});
		btnListerLesLivres_1.setBounds(173, 319, 198, 29);
		contentPane.add(btnListerLesLivres_1);
	}
}
