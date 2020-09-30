package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.shopping.cart.domain.ShoppingCart;

@Repository
public interface OrderRepo extends CrudRepository<ShoppingCart, Long> {

}