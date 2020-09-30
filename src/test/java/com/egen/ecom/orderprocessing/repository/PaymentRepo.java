package com.egen.ecom.orderprocessing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egen.ecom.orderprocessing.domain.Payment;
@Repository
public interface PaymentRepo  extends CrudRepository<Payment, Long> {

}