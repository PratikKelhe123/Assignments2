package com.training.example;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String bookName, String author, int price) throws RangeCheckException {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		if(price < 100 || price >500) {
			throw new RangeCheckException("Book price is not in range");
		}else {
			this.price = price;
		}
		
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) throws MyCustomException {
		
		if(bookName != null) {
			this.bookName = bookName;
		}else {
		
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			
			throw new MyCustomException("Book Name should not be null",e);
			
		}
		}
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price)  {
		
		
		try {
			if(price < 100 || price >500) {
				throw new RangeCheckException("Book price is not in range");
			}
		} catch (RangeCheckException e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	
	
}
