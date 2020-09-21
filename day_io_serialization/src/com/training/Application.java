package com.training;

import java.io.File;

import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		
	Book java = new Book(100,"headFirst","kathy siera",450);
		
		Book check = new Book();
		
		BookService service = new BookService();
		
//		boolean result = service.writeObject(java);
//		
//		if(result) {
//			System.out.println("Book persisted");
//		}
//		else {
//			System.out.println("Error-check");
//		}
//		
//		check = service.readObject();
		
		boolean result = service.writeWithDataStream(java,new File("books.ser"));

		
		if(result) {
			System.out.println("File is created and data is written");
		}else {
			System.out.println("File not created");
		}
		
		Book check2 = new Book();
		
		check2 = service.readWithDataStream(new File("books.ser"));
		
		System.out.println("file read");
		System.out.println(check2);
		
//		System.out.println(check);
		
		}
	}

