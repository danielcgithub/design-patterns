package com.learning.design.patterns.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		// Cannot create an instance of UniqueItem

		UniqueItem uniqueItem = UniqueItem.getInstance();
		uniqueItem.saySomething();
	}

}
