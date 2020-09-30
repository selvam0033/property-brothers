package com.egen.ecom.shopping.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.shopping.cart.domain.Item;

@Repository
public interface ItemRepo extends CrudRepository<Item, Long> {

}