package com.my.techit_spring_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.techit_spring_shop.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
