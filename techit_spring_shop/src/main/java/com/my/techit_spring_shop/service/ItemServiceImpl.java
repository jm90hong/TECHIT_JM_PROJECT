package com.my.techit_spring_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.my.techit_spring_shop.domain.Item;
import com.my.techit_spring_shop.repository.ItemRepository;


@Service
public class ItemServiceImpl implements ItemService{

	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		
		try {
            return  itemRepository.save(
                    new Item(
                    		item.getName(),
                    		item.getPrice()
                    )
            );
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
	}

	
	
}
