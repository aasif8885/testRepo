package com.bitwise.pizza.code;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	public static final String TOPPING_TOMATO = "Tomato";
	public static final String TOPPING_BABY_CORN = "Baby Corn";
	public static final String TOPPING_PINEAPPLE = "Pineapple";
	public static final String TOPPING_JALAPENO = "Jalapeno";
	public static final String TOPPING_CHICKEN_SALAMI = "Chicken Salami";
	public static final String TOPPING_OLIVES = "Olives";
	public static final String TOPPING_CAPSICUM = "Capsicum";
	public static final String TOPPING_PAPRIKA = "Paprika";
	public static final String TOPPING_PANEER = "Paneer";
	public static final String TOPPING_CHICKEN_SAUSAGE = "Chicken Sausage";
	public static final String TOPPING_BARBEQUE_CHICKEN = "Barbeque Chicken";
	public static final String TOPPING_SPICY_CHICKEN = "Spicy Chicken";
	public static final String TOPPING_ONION = "Onion";
	public static final String TOPPING_CHEESE = "Cheese";
	public static final String TOPPING_SMOKED_CHICKEN = "Smoked Chicken";

	public static final Map<String, Integer> TOPPING_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(TOPPING_TOMATO, 10);
			put(TOPPING_BABY_CORN, 10);
			put(TOPPING_PINEAPPLE, 20);
			put(TOPPING_JALAPENO, 15);
			put(TOPPING_CHICKEN_SALAMI, 95);
			put(TOPPING_OLIVES, 15);
			put(TOPPING_CAPSICUM, 10);
			put(TOPPING_PAPRIKA, 30);
			put(TOPPING_PANEER, 80);
			put(TOPPING_CHICKEN_SAUSAGE, 110);
			put(TOPPING_BARBEQUE_CHICKEN, 100);
			put(TOPPING_SPICY_CHICKEN, 90);
			put(TOPPING_ONION, 10);
			put(TOPPING_CHEESE, 20);
			put(TOPPING_SMOKED_CHICKEN, 150);
		}
	};

	public static final String CRUST_PAN_PIZZA = "Pan Pizza";
	public static final String CRUST_THIN_CRUST = "Thin Crust";
	public static final String CRUST_REGULAR = "Regular";
	public static final String CRUST_CHEESE_BURST = "Cheese Burst";

	public static final Map<String, Integer> CRUSTS_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(CRUST_PAN_PIZZA, 100);
			put(CRUST_THIN_CRUST, 150);
			put(CRUST_REGULAR, 0);
			put(CRUST_CHEESE_BURST, 200);
		}
	};

	public static final Integer VAT = 10;
	public static final Integer SERVICE_TAX = 15;

	public static final String PIZZA_MARGHERITA = "Margherita";
	public static final String PIZZA_HAWAIIAN_DELIGHT_VEG = "Hawaiian Delight Veg";
	public static final String PIZZA_HAWAIIAN_DELIGHT_NON_VEG = "Hawaiian Delight Non-Veg";
	public static final String PIZZA_VEGGIE_PARADISE = "Veggie Paradise";
	public static final String PIZZA_PEPPY_PANEER = "Peppy Paneer";
	public static final String PIZZA_ZESTY_CHICKEN = "Zesty Chicken";
	public static final String PIZZA_CHICKEN_MAXICANA = "Chicken Maxicana";
	public static final String PIZZA_SEVENTH_HEAVEN = "Seventh Heaven";
	public static final String PIZZA_CLOUD9 = "Cloud9";
	
	public static final String PIZZA_SIZE_SMALL = "Small";
	public static final String PIZZA_SIZE_MEDIUM = "Medium";
	public static final String PIZZA_SIZE_LARGE = "Large";

	public static final Map<String, Integer> MARGHERITA_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 80);
			put(PIZZA_SIZE_MEDIUM, 150);
			put(PIZZA_SIZE_LARGE, 300);
		}
	};

	public static final Map<String, Integer> HAWAIIAN_DELIGHT_VEG_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 100);
			put(PIZZA_SIZE_MEDIUM, 200);
			put(PIZZA_SIZE_LARGE, 400);
		}
	};

	public static final Map<String, Integer> HAWAIIAN_DELIGHT_NON_VEG_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 110);
			put(PIZZA_SIZE_MEDIUM, 220);
			put(PIZZA_SIZE_LARGE, 440);
		}
	};

	public static final Map<String, Integer> VEGGIE_PARADISE_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 115);
			put(PIZZA_SIZE_MEDIUM, 230);
			put(PIZZA_SIZE_LARGE, 460);
		}
	};

	public static final Map<String, Integer> PEPPY_PANEER_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 115);
			put(PIZZA_SIZE_MEDIUM, 230);
			put(PIZZA_SIZE_LARGE, 460);
		}
	};

	public static final Map<String, Integer> ZESTY_CHICKEN_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 140);
			put(PIZZA_SIZE_MEDIUM, 280);
			put(PIZZA_SIZE_LARGE, 560);
		}
	};

	public static final Map<String, Integer> CHICKEN_MAXICANA_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 150);
			put(PIZZA_SIZE_MEDIUM, 300);
			put(PIZZA_SIZE_LARGE, 600);
		}
	};

	public static final Map<String, Integer> SEVENTH_HEAVEN_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 125);
			put(PIZZA_SIZE_MEDIUM, 250);
			put(PIZZA_SIZE_LARGE, 500);
		}
	};

	public static final Map<String, Integer> CLOUD9_PRICE_MAP = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_SIZE_SMALL, 120);
			put(PIZZA_SIZE_MEDIUM, 240);
			put(PIZZA_SIZE_LARGE, 480);
		}
	};

	public static final Map<String, Map<String, Integer>> PIZZA_PRICE_MAP = new HashMap<String, Map<String, Integer>>() {
		private static final long serialVersionUID = 1L;
		{
			put(PIZZA_MARGHERITA, MARGHERITA_PRICE_MAP);
			put(PIZZA_HAWAIIAN_DELIGHT_VEG, HAWAIIAN_DELIGHT_VEG_PRICE_MAP);
			put(PIZZA_HAWAIIAN_DELIGHT_NON_VEG, HAWAIIAN_DELIGHT_NON_VEG_PRICE_MAP);
			put(PIZZA_VEGGIE_PARADISE, VEGGIE_PARADISE_PRICE_MAP);
			put(PIZZA_PEPPY_PANEER, PEPPY_PANEER_PRICE_MAP);
			put(PIZZA_ZESTY_CHICKEN, ZESTY_CHICKEN_PRICE_MAP);
			put(PIZZA_CHICKEN_MAXICANA, CHICKEN_MAXICANA_PRICE_MAP);
			put(PIZZA_SEVENTH_HEAVEN, SEVENTH_HEAVEN_PRICE_MAP);
			put(PIZZA_CLOUD9, CLOUD9_PRICE_MAP);
		}
	};
}
