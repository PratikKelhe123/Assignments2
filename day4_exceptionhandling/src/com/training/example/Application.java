package com.training.example;

import java.util.NoSuchElementException;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		try {
		BookService bookstore = new BookService();
		
		Book check = new Book();
		Book check1 = new Book();
		Book check2 = new Book();
		Book check3 = new Book();
		Book check4 = new Book();
		
		Book[] bookList = new Book[50];	
		Book java = new Book();
		java.setBookId(1233);
		java.setBookName("java");
		java.setAuthor("James");
		java.setPrice(350);
		
		
		check3 = bookstore.add(java);
		
		System.out.println(check3.getBookName() + " added to list");
		
		Book journey = new Book(1234, "journey", "Ramesh", 400);
		
		Book victory = new Book(1235, "victory", "Ram", 300);
		
		Book life = new Book(1236, "life", "Suresh", 200);
		
		check = bookstore.add(journey);
		
		System.out.println(check.getBookName()+"added to list");
		
		check1 = bookstore.add(victory);
		check2 = bookstore.add(life);
		
		
		
		bookstore.getOne(life);
		
		bookList = bookstore.getAll();
		
		check4 = bookstore.getOne(null);
		
		for(Book b : bookList) {
		System.out.println(b.getBookName());
		}
		
		}catch(RangeCheckException e) {
			System.out.println("Book price is not valid");
		}
		catch(MyCustomException e) {
			System.out.println("My custom exception");
			e.getMessage();
		}
		catch(NoSuchElementException e){
			System.out.println("Book requested not found");
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
