package com.my.techit_spring_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.techit_spring_shop.domain.Item;
import com.my.techit_spring_shop.domain.ItemOrder;
import com.my.techit_spring_shop.service.ItemOrderServiceImpl;
import com.my.techit_spring_shop.service.ItemServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api/item")
public class ItemController {

	@Autowired
    ItemServiceImpl itemServiceImpl;
	
	@Autowired
    ItemOrderServiceImpl itemOrderServiceImpl;
	
	
	//상품 등록
	@PostMapping("create")
	public ResponseEntity<Item> create(
				@RequestBody Item item
			){
		
		
		try {
			
			Item result = itemServiceImpl.save(item);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return  null;
	}
	
	
	//상품 구매: member_id 가 1인 회원이 상품을 구매하는 상황.
	@PostMapping("order")
	public ResponseEntity<ItemOrder> order(
				@RequestParam(value="member_id") Long memberId,
				@RequestParam(value="item_id") Long ItemId,
				@RequestParam(value="address") String address
			){
		
		
		try {
			
			
			ItemOrder order = new ItemOrder();
			order.setMemberId(memberId);
			order.setItemId(ItemId);
			order.setAddress(address);
			
			
			ItemOrder result = itemOrderServiceImpl.save(order);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return  null;
	}
	
}
