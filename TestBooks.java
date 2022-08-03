package com.books.demo;

import java.util.Scanner;

public class TestBooks {
	
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		Author authors[]= new Author[2] ;
		
		authors[0] = new Author("Baskaran", "boss@gmail.com",'m');
		authors[1] = new Author("Karan", "bossbk@gmail.com",'m');
		
		
	/*     System.out.println(" Enter the " + authors.length + " Details ");
	     
	     for(int i=0; i< authors.length; i++) {
	    	 String name = scanner.next();
	    	 String email = scanner.next();
	    	 char gender = scanner.next().charAt(0);
	    	 
	    	 authors[i] = new Author(name, email,gender);
	     }
	     */
		
		Books b1 = new Books("comics", authors, 240.50 ,  1);
		System.out.println(b1);
		
		b1.setPrice(120);
		b1.setQty(3);
		System.out.println(b1);
		 
		
		 System.out.println(" Book Name: " + b1.getName());	
		 System.out.println(" Authors: " + b1.getAuthorNames());
	     System.out.println(" Book Price: " + b1.getPrice());	     
	     System.out.println(" Book Qty: " + b1.getQty());
	     
	//     System.out.println(b1.getAuthors());
	     String msg = "";
	     Author authorsD[] = b1.getAuthors();
	     
	     for(int i=0; i<authorsD.length; i++ ) {
	    	 msg = msg+authorsD[i].getName()+"," + authorsD[i].getEmail()+"," + authorsD[i].getGender()+"\n";
	     }
	     
	     System.out.println(msg);
	
	scanner.close();
	}

}
