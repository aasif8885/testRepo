package com.bitwise.pizza.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bitwise.pizza.code.Inventory;
import com.bitwise.pizza.code.Order;
import com.bitwise.pizza.code.Pizza;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdersTests {
	@Test
	public void testForOrder_1() {
		System.out.println("Order#1 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_VEGGIE_PARADISE);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_ZESTY_CHICKEN);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_CHICKEN_MAXICANA);
		order.getPizzaList().add(pizza);

		assertEquals(1012.5, order.getBill(), 0);
	}

	@Test
	public void testForOrder_2() {
		System.out.println("Order#2 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		pizza.setCrust(Inventory.CRUST_PAN_PIZZA);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_NON_VEG);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_BARBEQUE_CHICKEN);
		pizza.setCrust(Inventory.CRUST_CHEESE_BURST);
		order.getPizzaList().add(pizza);

		assertEquals(1068.75, order.getBill(), 0);
	}
}
