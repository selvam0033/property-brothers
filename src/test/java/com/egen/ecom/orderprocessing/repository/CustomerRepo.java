package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.orderprocessing.domain.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

}