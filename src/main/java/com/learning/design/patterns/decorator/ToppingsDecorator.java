package com.learning.design.patterns.decorator;

public abstract class ToppingsDecorator implements Burger {

	protected final Burger decoratedBurger;

	public ToppingsDecorator(final Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	public double getPrice() {
		return decoratedBurger.getPrice();
	}

}
