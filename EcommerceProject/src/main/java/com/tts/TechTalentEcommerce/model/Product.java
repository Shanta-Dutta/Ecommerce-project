package com.tts.TechTalentEcommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;
	private int quatity;
	private double price;
	private String description;
	 private String name;
	 private String password;
		private String brand;
		private String category;
		private String image;
	
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
	private com.tts.TechTalentEcommerce.model.User user;

    public Product() { }

    public Product(Long id, String description, double price, Date date) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.date = date;
    }
    //getters and setters
	
	public Long getId() {
		return id;
		}
	
		public User getquantity() {
		return user;
		}
	
		public void setUser(User user) {
		this.user = user;
		}

		public Object getDescription() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getDate() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getPrice() {
			// TODO Auto-generated method stub
			return null;
		}

		public void addProduct(Long id2, Object description2, Object price2, Object date2) {
			// TODO Auto-generated method stub
			
		}
		
}
