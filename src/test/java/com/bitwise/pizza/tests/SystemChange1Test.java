package com.bitwise.pizza.tests;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bitwise.pizza.code.Inventory;
import com.bitwise.pizza.code.Order;
import com.bitwise.pizza.code.Pizza;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemChange1Test {
	@Test
	public void testForOrder_3() {
		System.out.println("Order#3 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_PEPPY_PANEER);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_CAPSICUM);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_PEPPY_PANEER);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_CAPSICUM);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_PEPPY_PANEER);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_PEPPY_PANEER);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		pizza.setCrust(Inventory.CRUST_THIN_CRUST);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_MARGHERITA);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_ZESTY_CHICKEN);
		pizza.getRemovedToppingSet().add(Inventory.TOPPING_PAPRIKA);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BABY_CORN);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_ONION);
		pizza.setCrust(Inventory.CRUST_CHEESE_BURST);
		order.getPizzaList().add(pizza);

		assertEquals(3093.75, order.getBill(), 0);
	}
}
