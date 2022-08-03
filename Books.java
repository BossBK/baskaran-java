package com.books.demo;

public class Books {
	
	private String name;
	private Author[] authors = new Author[3];
	private double price;
	private int qty;
	
	public Books(String name, Author[] authors, double price) {
		
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Books(String name, Author[] authors, double price, int qty) {
		
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		
		String msg ="";
		for(int i =0; i<authors.length; i++) {
			msg = msg+authors[i].getName()+"," + authors[i].getEmail() + "," + authors[i].getGender()+",";
		}
		
		return "Book [name=" + name + ",author= " + msg + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public String getAuthorNames() {
		String msg ="";
		for(int i =0; i<authors.length; i++) {
			msg = msg+authors[i].getName()+",";
		}
		return msg;
		
	}

}