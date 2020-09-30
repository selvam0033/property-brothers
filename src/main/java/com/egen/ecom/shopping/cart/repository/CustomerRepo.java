package com.egen.ecom.shopping.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.shopping.cart.domain.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}