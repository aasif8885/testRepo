package com.bitwise.pizza.code;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Pizza> pizzaList;

	public Order() {
		this.setPizzaList(new ArrayList<Pizza>());
	}

	public int checkNoOfPizzas() {
		return getPizzaList().size();
	}

	public List<Pizza> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public Double getBill() {
		Double billAmt = 0.0, serviceTax = 0.0, vat = 0.0;
		int pcnt = 1;

		if (null != this.getPizzaList() && this.getPizzaList().size() != 0) {
			System.out.println("Your order details:");
			System.out.println("------------------------------");
			System.out.println("Pizza Name\t\tPrice");
			System.out.println("------------------------------");

			for (Pizza pizza : this.getPizzaList()) {
				billAmt += Inventory.PIZZA_PRICE_MAP.get(pizza.getName()).get(pizza.getSize());
				System.out.println("\n" + pcnt++ + ") " + pizza.getName() + "\t" + Inventory.PIZZA_PRICE_MAP.get(pizza.getName()).get(pizza.getSize()));

				if (!pizza.getSize().equals(Inventory.PIZZA_SIZE_SMALL)) {
					if (null != pizza.getAddedToppingSet() && pizza.getAddedToppingSet().size() != 0) {
						System.out.println(">> Toppings added :");
						for (String topping : pizza.getAddedToppingSet()) {
							System.out.println("\t" + topping + "\t" + Inventory.TOPPING_PRICE_MAP.get(topping));
							billAmt += Inventory.TOPPING_PRICE_MAP.get(topping);
						}
					}

					if (null != pizza.getCrust() && !pizza.getCrust().equals("")) {
						System.out.println(">> Selected Crust :");
						System.out.println("\t" + pizza.getCrust() + "\t" + Inventory.CRUSTS_PRICE_MAP.get(pizza.getCrust()));
							if(pizza.getCrust().equals(Inventory.CRUST_CHEESE_BURST)){
								if(pizza.getSize().equals(Inventory.PIZZA_SIZE_MEDIUM)){
									billAmt+=Inventory.CRUSTS_PRICE_MAP.get(pizza.getCrust());
								}
							}else{
								billAmt+=Inventory.CRUSTS_PRICE_MAP.get(pizza.getCrust());
							}
					}

					if (null != pizza.getRemovedToppingSet() && pizza.getRemovedToppingSet().size() != 0) {
						System.out.println(">> Removed Toppings : " + pizza.getRemovedToppingSet());
						pizza.getDefaultToppingSet().removeAll(pizza.getRemovedToppingSet());
						System.out.println(">> Toppings kept : " + pizza.getDefaultToppingSet());
					}
				}
			}
			System.out.println("------------------------------");
			System.out.println("Total\t\t\t" + billAmt);

			vat = (billAmt * Inventory.VAT) / 100;
			serviceTax = (billAmt * Inventory.SERVICE_TAX) / 100;

			System.out.println("------------------------------");
			System.out.println("VAT(" + Inventory.VAT + "%)\t\t" + vat);
			System.out.println("Service Tax(" + Inventory.SERVICE_TAX + "%)\t" + serviceTax);
			System.out.println("------------------------------");

			billAmt += vat + serviceTax;
			System.out.println("Final Total\t\t" + billAmt);
			System.out.println("------------------------------\n\n");
		}
		return billAmt;
	}
}
