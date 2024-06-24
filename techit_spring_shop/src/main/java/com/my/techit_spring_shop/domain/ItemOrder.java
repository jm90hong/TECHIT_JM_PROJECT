package com.my.techit_spring_shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="itemorders")
public class ItemOrder {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="mmeber_id")
    private  Long memberId;

    @Column(name="item_id")
    private  Long itemId;


    @Column(name="address")
    private  String address;

    
    
    public ItemOrder(Long memberId, Long itemId, String address){
        this.memberId=memberId;
        this.itemId=itemId;
        this.address=address;
    }

	public ItemOrder() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
    
    
    
    
    
}
