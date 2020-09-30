package com.egen.ecom.shopping.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.shopping.cart.domain.ShoppingCart;

@Repository
public interface ShoppingCartRepo extends CrudRepository<ShoppingCart, Integer> {

}
