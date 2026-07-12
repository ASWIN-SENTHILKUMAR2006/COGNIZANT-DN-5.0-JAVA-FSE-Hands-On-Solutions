package com.library.service;

import com.library.repository.BookRepository;

/**
 * @author Aswin Senthilkumar
 *
 */
public class BookService {
	
	BookRepository repo;
	
	public void setRepo(BookRepository repo) {
		this.repo = repo;
	}
	
	public String displayService(String User) {
		 System.out.println("User: "+User);
        System.out.println("Book Service is working.");
        repo.displayRepository();
        return User;
    }
}
