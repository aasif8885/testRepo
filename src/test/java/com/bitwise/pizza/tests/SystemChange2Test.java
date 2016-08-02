package com.bitwise.pizza.tests;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bitwise.pizza.code.Inventory;
import com.bitwise.pizza.code.Order;
import com.bitwise.pizza.code.Pizza;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemChange2Test {
	@Test
	public void testForOrder_4(){
		System.out.println("Order#4 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_CLOUD9);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_CAPSICUM);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		order.getPizzaList().add(pizza);
		
		pizza = new Pizza(Inventory.PIZZA_CLOUD9);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_CAPSICUM);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		order.getPizzaList().add(pizza);
		
		pizza=new Pizza(Inventory.PIZZA_CLOUD9);
		pizza.setSize(Inventory.PIZZA_SIZE_SMALL);
		order.getPizzaList().add(pizza);
		
		pizza=new Pizza(Inventory.PIZZA_CLOUD9);
		pizza.setSize(Inventory.PIZZA_SIZE_LARGE);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		order.getPizzaList().add(pizza);
		
		pizza=new Pizza(Inventory.PIZZA_SEVENTH_HEAVEN);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_SMOKED_CHICKEN);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		pizza.setSize(Inventory.PIZZA_SIZE_LARGE);
		order.getPizzaList().add(pizza);
		
		pizza=new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG);
		pizza.setSize(Inventory.PIZZA_SIZE_SMALL);
		order.getPizzaList().add(pizza);
		
		pizza=new Pizza(Inventory.PIZZA_ZESTY_CHICKEN);
		pizza.setSize(Inventory.PIZZA_SIZE_MEDIUM);
		pizza.setCrust(Inventory.CRUST_CHEESE_BURST);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_PAPRIKA);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_ONION);
		order.getPizzaList().add(pizza);
		
		assertEquals(3418.75, order.getBill(), 0);
	}
}
