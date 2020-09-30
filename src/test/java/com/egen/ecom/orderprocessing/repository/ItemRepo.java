package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.orderprocessing.domain.Item;

@Repository
public interface ItemRepo extends CrudRepository<Item, Long> {

}