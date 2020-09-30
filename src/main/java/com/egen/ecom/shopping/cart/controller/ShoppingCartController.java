package com.egen.ecom.shopping.cart.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egen.ecom.shopping.cart.domain.Customer;
import com.egen.ecom.shopping.cart.domain.Item;
import com.egen.ecom.shopping.cart.domain.Orders;
import com.egen.ecom.shopping.cart.domain.ShoppingCart;
import com.egen.ecom.shopping.cart.domain.ShoppingCarts;
import com.egen.ecom.shopping.cart.services.OrderService;



@RestController
@RequestMapping("/api/v1")
public class ShoppingCartController {

    @Autowired
    private OrderService orderService;
    
   
    
    
	@PostMapping("/createItem")
	public  Item createItem(@RequestBody Item item) {
		return orderService.insertItem(item);
	}
	
	@PostMapping("/createCustomer")
	public  Customer createCustomer(@RequestBody Customer customer) {		
		return orderService.insertCustomer(customer);
	}



    @GetMapping("/cart/{id}")
	public ShoppingCart getCartById(@PathVariable int id) {	 
		return orderService.getCartById(id);	
		
    }
    
    
    @GetMapping("/order/{id}")
   	public Orders getOrderId(@PathVariable int id) {	 
   		return orderService.getOrderById(id);	
   		
       }
    

	
	@PostMapping("/createAnOrder")
	public  ShoppingCart createAnOrder(@RequestBody ShoppingCart shoppingCart) {
		return orderService.insertOrUpdateOrder(shoppingCart);
	}
	
	
	
	@PutMapping("/cancelAnOrder")
	public  ShoppingCart cancelAnOrder(@RequestBody ShoppingCart shoppingCart) {
		return orderService.insertOrUpdateOrder(shoppingCart);
	}
	
	
	@PostMapping("/createBulkOrder")
	public  ShoppingCarts createBulkOrder(@RequestBody ShoppingCarts shoppingCarts) {
		ShoppingCarts orderList = new ShoppingCarts();
		Set<ShoppingCart> set = new HashSet<ShoppingCart>();
		for(ShoppingCart shoppingCart : shoppingCarts.getList())
			set.add(orderService.insertOrUpdateOrder(shoppingCart));
		 
		orderList.setList(set);
		return orderList;
	}
	
	
	
	
	@PutMapping("/cancelBulkOrder")
	public  ShoppingCarts cancelBulkOrder(@RequestBody ShoppingCarts shoppingCarts) {
		ShoppingCarts orderList = new ShoppingCarts();
		Set<ShoppingCart> set = new HashSet<ShoppingCart>();
		for(ShoppingCart shoppingCart : shoppingCarts.getList())
			set.add(orderService.insertOrUpdateOrder(shoppingCart));
		 
		orderList.setList(set);
		return orderList;
	}
}
