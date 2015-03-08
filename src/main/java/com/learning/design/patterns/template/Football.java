package com.learning.design.patterns.template;

public class Football extends Game {

	@Override
	void startGame() {
		System.out.println("Starting " + this.getClass().getSimpleName());
	}

	@Override
	void endGame() {
		System.out.println("Ending " + this.getClass().getSimpleName());
	}

}
