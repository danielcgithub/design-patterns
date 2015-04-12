package com.learning.design.patterns.decorator;

public class OnionToppingsDecorator extends ToppingsDecorator {

	private final double onionPrice = 2;

	public OnionToppingsDecorator(final Burger decoratedBurger) {
		super(decoratedBurger);
	}

	@Override
	public double getPrice() {
		System.out.println("Adding onions..");
		return decoratedBurger.getPrice() + onionPrice;
	}
}
