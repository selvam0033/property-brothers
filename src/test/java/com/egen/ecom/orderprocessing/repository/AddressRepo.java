package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.orderprocessing.domain.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

}
