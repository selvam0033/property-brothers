package com.egen.ecom.shopping.cart.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egen.ecom.shopping.cart.domain.Customer;
import com.egen.ecom.shopping.cart.domain.Item;
import com.egen.ecom.shopping.cart.domain.Orders;
import com.egen.ecom.shopping.cart.domain.ShoppingCart;
import com.egen.ecom.shopping.cart.repository.CustomerRepo;
import com.egen.ecom.shopping.cart.repository.ItemRepo;
import com.egen.ecom.shopping.cart.repository.OrdersRepo;
import com.egen.ecom.shopping.cart.repository.ShoppingCartRepo;
import com.egen.ecom.shopping.cart.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    
    @Autowired
    private OrdersRepo ordersRepo;
    
  
    @Autowired
    private ItemRepo itemRepo;
    
    @Autowired
    private CustomerRepo customerRepo;
    
    
	@Override
	public Orders getOrderById(int orderId) {
		Optional<Orders> order = ordersRepo.findById(orderId);
		return order.get();
	}
	
  

	@Override
	public ShoppingCart getCartById(int cartId) {
		Optional<ShoppingCart> order = shoppingCartRepo.findById(cartId);
		return order.get();
	}



	@Override
	@Transactional
	public ShoppingCart insertOrUpdateOrder(ShoppingCart shoppingCart) {
		ShoppingCart order = (ShoppingCart)shoppingCartRepo.save(shoppingCart);		
		return order;
	}





	@Override
	public Item insertItem(Item item) {		
		return itemRepo.save(item);
	}
	
	
	@Override
	public Customer insertCustomer(Customer customer) {		
		return customerRepo.save(customer);
	}




	  
	
}
