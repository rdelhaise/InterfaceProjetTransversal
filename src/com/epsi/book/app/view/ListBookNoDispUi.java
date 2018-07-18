package com.epsi.book.app.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.epsi.book.app.action.LibraryBook;

import javax.swing.JTextPane;

public class ListBookNoDispUi extends JFrame {

	private JPanel contentPane;


	public ListBookNoDispUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LISTE DES LIVRE NON DISPONIBLES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 6, 438, 20);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel);
		
		LibraryBook biblio= LibraryBook.getInstance();
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(73, 55, 493, 283);
		contentPane.add(textPane);
		textPane.setText(biblio.getBooksBorrowed().toString()); 
		
		JButton btnAccueil = new JButton("ACCUEIL");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeUi fen= new HomeUi();
				fen.setVisible(true);
				setVisible(false);
			}
		});
		btnAccueil.setBounds(267, 352, 117, 29);
		contentPane.add(btnAccueil);
	}
}
