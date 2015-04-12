package com.learning.design.patterns.decorator;

public class DecoratorDriver {

	public static void main(final String[] args) {
		Burger cheeseBurger = new CheeseBurger();
		System.out.println("Cheese Burger: " + cheeseBurger.getPrice());

		Burger cheeseBurgerWOnions = new OnionToppingsDecorator(cheeseBurger);
		System.out.println("Cheese Burger With Onions: " + cheeseBurgerWOnions.getPrice());

		Burger gourmetBurger = new GourmetBurger();
		System.out.println("Gourmet Burger: " + gourmetBurger.getPrice());

		Burger gourmetBurgerWOnions = new OnionToppingsDecorator(gourmetBurger);
		System.out.println("Gourmet Burger With Onions: " + gourmetBurgerWOnions.getPrice());
	}

}
