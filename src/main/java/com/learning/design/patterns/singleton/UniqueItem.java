package com.learning.design.patterns.singleton;

public class UniqueItem {

	private static UniqueItem uniqueItem = new UniqueItem();

	private UniqueItem() {
	}

	public static UniqueItem getInstance() {
		return uniqueItem;
	}

	public void saySomething() {
		System.out.println("I am a unique item.");
	}

}
