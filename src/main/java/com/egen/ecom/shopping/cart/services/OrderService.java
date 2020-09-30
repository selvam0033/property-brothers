package com.egen.ecom.shopping.cart.services;

import com.egen.ecom.shopping.cart.domain.Customer;
import com.egen.ecom.shopping.cart.domain.Item;
import com.egen.ecom.shopping.cart.domain.Orders;
import com.egen.ecom.shopping.cart.domain.ShoppingCart;

public interface OrderService {
	
	public Item insertItem(Item item);	 
	
	public Customer insertCustomer(Customer customer);

    public ShoppingCart insertOrUpdateOrder(ShoppingCart orderDetail);
    
    public Orders getOrderById(int orderId);
    
    public ShoppingCart getCartById(int cartId);
    

}
