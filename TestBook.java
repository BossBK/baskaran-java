package com.books.demo;

public class TestBook {
	
	public static void main(String[] args) {
		Author a1= new Author("Baskaran", "bossbk259@gmail.com" , 'm' ) ;
	     System.out.println(a1);
		
		Book b1 = new Book("comics", a1, 240.50 ,  1);
		System.out.println(b1);
		
		b1.setPrice(120);
		b1.setQty(3);
		System.out.println(b1);
		
		 System.out.println(" Book Name: " + b1.getName());		 
		 System.out.println(" Author's Name: " + a1.getName());		 
	     System.out.println(" Author's Email: " + a1.getEmail());	     
	     System.out.println(" Author's Gender: " + a1.getGender());     
	     System.out.println(" Book Price: " + b1.getPrice());	     
	     System.out.println(" Book Qty: " + b1.getQty());
	}

}
