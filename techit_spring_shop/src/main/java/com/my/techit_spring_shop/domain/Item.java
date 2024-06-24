package com.my.techit_spring_shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="items")
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

  
    @Column(name="name")
    private  String name;


    @Column(name="price")
    private  int price;


    public Item(){}



    public Item(String name, int price){
        
        this.name=name;
        this.price=price;
    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}

   
    
    
    
}
