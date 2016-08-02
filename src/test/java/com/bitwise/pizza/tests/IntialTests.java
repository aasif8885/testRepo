package com.bitwise.pizza.tests;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bitwise.pizza.code.Inventory;
import com.bitwise.pizza.code.Order;
import com.bitwise.pizza.code.Pizza;
import com.bitwise.pizza.exceptions.IncorrectCrustException;
import com.bitwise.pizza.exceptions.IncorrectToppingException;
import com.bitwise.pizza.exceptions.NoToppingsAddedException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntialTests {

	@Test
	public void test0_ForOrderIsNil() {
		System.out.println("User Story #0 : No pizza selected.");
		Order order = new Order();
		assertEquals(0, order.checkNoOfPizzas());
	}
	
	@Test(expected=NoToppingsAddedException.class)
	public void test_forNoToppingSelectedAndAskedForPizzaWithToppings() throws NoToppingsAddedException{
		Pizza pizza=new Pizza(Inventory.PIZZA_PEPPY_PANEER);
		if(pizza.getAddedToppingSet().size()==0){
			throw new NoToppingsAddedException();
		}
	}
	
	@Test(expected=IncorrectToppingException.class)
	public void test_forIncorrectTopping() throws IncorrectToppingException{
		String incorrectToppings="Potato";
		if(!Inventory.TOPPING_PRICE_MAP.containsKey(incorrectToppings)){
			throw new IncorrectToppingException();
		}
	}
	
	@Test(expected=IncorrectCrustException.class)
	public void test_forIncorrectCrust() throws IncorrectCrustException{
		String incorrectCrust="DoublePatty";
		if(!Inventory.CRUSTS_PRICE_MAP.containsKey(incorrectCrust)){
			throw new IncorrectCrustException();
		}
	}

	@Test
	public void test1_ForSelectAnyPizza() {
		System.out.println("\n\nUser Story #1 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_CHICKEN_MAXICANA);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG);
		order.getPizzaList().add(pizza);

		assertNotEquals(0, order.getBill());
	}

	@Test
	public void test2_ForAddPizzasAndToppings() {
		System.out.println("\n\nUser Story #2 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_CHICKEN_MAXICANA);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_PANEER);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHICKEN_SAUSAGE);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CAPSICUM);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHEESE);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_OLIVES);
		order.getPizzaList().add(pizza);

		pizza = new Pizza(Inventory.PIZZA_MARGHERITA);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_SMOKED_CHICKEN);
		order.getPizzaList().add(pizza);

		assertNotEquals(0, order.getBill());
	}

	@Test
	public void test3_ForAddMorePizzasAndToppingsAndChangeCrust() {
		System.out.println("\n\nUser Story #3 :");
		Order order = new Order();

		Pizza pizza = new Pizza(Inventory.PIZZA_CHICKEN_MAXICANA);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_PANEER);
		pizza.getAddedToppingSet().add(Inventory.TOPPING_CHICKEN_SAUSAGE);
		pizza.setCrust(Inventory.CRUST_PAN_PIZZA);
		order.getPizzaList().add(pizza);

		assertNotEquals(0, order.getBill());
	}
}
