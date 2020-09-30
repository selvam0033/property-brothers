package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.shopping.cart.domain.Orders;

@Repository
public interface OrdersRepo extends CrudRepository<Orders, Long> {

}
