package com.bitwise.pizza.code;

import java.util.Set;
import java.util.TreeSet;

public class Pizza {
	private String name;
	private String size=Inventory.PIZZA_SIZE_MEDIUM;// Default size is Medium
	private Set<String> defaultToppingSet;
	private Set<String> addedToppingSet;
	private String crust=Inventory.CRUST_REGULAR;// Default crust is Regular
	private Set<String> removedToppingSet;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Set<String> getDefaultToppingSet() {
		return defaultToppingSet;
	}

	public void setDefaultToppingSet(Set<String> defaultToppingSet) {
		this.defaultToppingSet = defaultToppingSet;
	}

	public Set<String> getAddedToppingSet() {
		return addedToppingSet;
	}

	public void setAddedToppingSet(Set<String> addedToppingSet) {
		this.addedToppingSet = addedToppingSet;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	public Pizza(String name) {
		super();
		this.setName(name);
		this.setDefaultToppingSet(new TreeSet<String>());
		this.setAddedToppingSet(new TreeSet<String>());
		this.setRemovedToppingSet(new TreeSet<String>());
		
		switch (name) {
		case Inventory.PIZZA_MARGHERITA:
			this.getDefaultToppingSet().add(Inventory.TOPPING_TOMATO);
			break;
		case Inventory.PIZZA_HAWAIIAN_DELIGHT_VEG:
			this.getDefaultToppingSet().add(Inventory.TOPPING_BABY_CORN);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PINEAPPLE);
			this.getDefaultToppingSet().add(Inventory.TOPPING_JALAPENO);
			break;
		case Inventory.PIZZA_HAWAIIAN_DELIGHT_NON_VEG:
			this.getDefaultToppingSet().add(Inventory.TOPPING_CHICKEN_SALAMI);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PINEAPPLE);
			this.getDefaultToppingSet().add(Inventory.TOPPING_JALAPENO);
			break;
		case Inventory.PIZZA_VEGGIE_PARADISE:
			this.getDefaultToppingSet().add(Inventory.TOPPING_BABY_CORN);
			this.getDefaultToppingSet().add(Inventory.TOPPING_OLIVES);
			this.getDefaultToppingSet().add(Inventory.TOPPING_CAPSICUM);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PAPRIKA);
			break;
		case Inventory.PIZZA_PEPPY_PANEER:
			this.getDefaultToppingSet().add(Inventory.TOPPING_PANEER);
			this.getDefaultToppingSet().add(Inventory.TOPPING_CAPSICUM);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PAPRIKA);
			break;
		case Inventory.PIZZA_ZESTY_CHICKEN:
			this.getDefaultToppingSet().add(Inventory.TOPPING_CHICKEN_SAUSAGE);
			this.getDefaultToppingSet().add(Inventory.TOPPING_BARBEQUE_CHICKEN);
			this.getDefaultToppingSet().add(Inventory.TOPPING_CAPSICUM);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PAPRIKA);
			break;
		case Inventory.PIZZA_CHICKEN_MAXICANA:
			this.getDefaultToppingSet().add(Inventory.TOPPING_ONION);
			this.getDefaultToppingSet().add(Inventory.TOPPING_TOMATO);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PAPRIKA);
			this.getDefaultToppingSet().add(Inventory.TOPPING_SPICY_CHICKEN);
			break;
		case Inventory.PIZZA_SEVENTH_HEAVEN:
			this.getDefaultToppingSet().add(Inventory.TOPPING_SMOKED_CHICKEN);
			this.getDefaultToppingSet().add(Inventory.TOPPING_JALAPENO);
			break;
		case Inventory.PIZZA_CLOUD9:
			this.getDefaultToppingSet().add(Inventory.TOPPING_ONION);
			this.getDefaultToppingSet().add(Inventory.TOPPING_TOMATO);
			this.getDefaultToppingSet().add(Inventory.TOPPING_PANEER);
			this.getDefaultToppingSet().add(Inventory.TOPPING_CAPSICUM);
			this.getDefaultToppingSet().add(Inventory.TOPPING_JALAPENO);
			break;
		}
	}

	public Set<String> getRemovedToppingSet() {
		return removedToppingSet;
	}

	public void setRemovedToppingSet(Set<String> removedToppingSet) {
		this.removedToppingSet = removedToppingSet;
	}
}
