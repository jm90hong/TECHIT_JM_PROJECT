package com.my.techit_spring_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.techit_spring_shop.domain.ItemOrder;
import com.my.techit_spring_shop.repository.ItemOrderRepository;

@Service
public class ItemOrderServiceImpl implements ItemOrderService{

	
	@Autowired
	private ItemOrderRepository itemOrderRepository;
	
	@Override
	public ItemOrder save(ItemOrder itemOrder) {
		// TODO Auto-generated method stub
	
		try {
            return  itemOrderRepository.save(
                    new ItemOrder(
                    		itemOrder.getMemberId(),
                    		itemOrder.getItemId(),
                    		itemOrder.getAddress()
                    )
            );
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
	}

	
	
	
}
