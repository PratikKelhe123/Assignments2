package com.training.example;

import java.util.NoSuchElementException;

public class BookService {

		
		Book[] bookList = new Book[50];
		private int i = 0;
		public Book add(Book book) {
			
			bookList[i] = book;
			i++;
			return book;
		}
		
		public Book getOne(Book book) throws NoSuchElementException {
			
			boolean flag = false;
			
			for(Book b : bookList) {
				if(b.getBookId() == book.getBookId()) {
					flag = true;
					return b;
				}
			}
			if(flag == false) {
				throw new NoSuchElementException();
			}
			return book;
		}
		
		
		public Book[] getAll() {
			return bookList;
		}
}
