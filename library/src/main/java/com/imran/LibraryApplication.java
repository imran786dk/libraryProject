package com.imran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.imran.domain.Book;
import com.imran.repository.BookRepository;

@SpringBootApplication
public class LibraryApplication {
	
	@Autowired
	private BookRepository bookRepo;
	
	@Component
	class DataSetup implements ApplicationRunner {
		
		@Override
		public void run(ApplicationArguments args) throws Exception {
			
			bookRepo.save(Book.builder().title("Gone with the Wind").isbn("12345").build());
			bookRepo.save(Book.builder().title("Effective Java").isbn("45678").build());
			
		}
		
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
