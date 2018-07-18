package com.epsi.book.app;

import java.awt.EventQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epsi.book.app.action.LibraryBook;
import com.epsi.book.app.dao.GoogleBookDAO;
import com.epsi.book.app.view.HomeUi;
import com.epsi.book.app.work.Book;

@SpringBootApplication
public class main {
	public static void main(String[] args)   {
		SpringApplication.run(GoogleBookDAO.class, args);		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeUi frame = new HomeUi(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
}
