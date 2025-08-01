package com.example.bookstore.Model;



import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private String publisher;
    private double price;
    private int stock; 
    

   

	public int getId() { 
		return id; 
		}

    public void setId(int id) {
    	this.id = id; 
    	}

    public String getTitle() { 
    	return title; 
    	}

    public void setTitle(String title) {
    	this.title = title; 
    	}

    public String getAuthor() { 
    	return author; 
    	}

    public void setAuthor(String author) { 
    	this.author = author;
    	}

    public String getPublisher() { 
    	return publisher;
}

    public void setPublisher(String publisher) {
    	this.publisher = publisher; 
    	}

    public double getPrice() { 
    	return price; 
    	}

    public void setPrice(double price) { 
    	this.price = price;
    	}
    public int getStock() {
		return stock;
	    }

	public void setStock(int stock) {
		this.stock = stock;
	    }
}
