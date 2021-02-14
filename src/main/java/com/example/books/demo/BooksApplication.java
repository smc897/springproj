package com.example.books.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooksApplication {

	public static void main(String[] args) {
                Book b=new Book();
		SpringApplication.run(BooksApplication.class, args);
	}

}
