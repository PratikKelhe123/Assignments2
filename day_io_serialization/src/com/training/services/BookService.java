package com.training.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.Book;

public class BookService {

	public boolean writeObject(Book book) {
		boolean persisted = false;
		
		ObjectOutputStream outStream = null;
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
			
			outStream.writeObject(book);
			
			persisted = true;
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		finally {
			
				try {
					outStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			 
		}
		
		return persisted;
	}
	
	public Book readObject() {
		Book book = null;
		
		ObjectInputStream inStream = null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream(new File("book.ser")));
			
			book = (Book) inStream.readObject();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return book;
	}
	
	public boolean writeWithDataStream(Book bk, File file) {
		
		
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
			
			out.writeInt(bk.getBookNumber());
			out.writeUTF(bk.getBookName());
			out.writeUTF(bk.getAuthor());
			out.writeInt(bk.getPrice());
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	public Book readWithDataStream(File file) {
		DataInputStream read = null;
		Book java = new Book();
		
		try {
			read = new DataInputStream(new FileInputStream(file));
			
			int booknumber = read.readInt();
			String bookName = read.readUTF();
			String bookAuthor = read.readUTF();
			int bookPrice = read.readInt();
			java.setBookNumber(booknumber);
			java.setBookName(bookName);
			java.setAuthor(bookAuthor);
			java.setPrice(bookPrice);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
 		
		return java;
	}
	
}
