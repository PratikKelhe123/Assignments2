package com.training;

import java.io.*;

public class FilesExample {
	
	public void writeToFile(File file,Customer cust) {
		
		PrintWriter writer = null;
		
		try {
//			 writer = new PrintWriter(file);
			
			writer = new PrintWriter(new FileWriter(file,true));
			
			 writer.println(cust.toString());
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
	}
	
	public void readFromFile(File file) {
		BufferedReader reader=null;
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			
			System.out.println("File data is ");
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
