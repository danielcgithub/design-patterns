package com.learning.design.patterns.template;

public abstract class Game {
	
	abstract void startGame();
	abstract void endGame();
	
	public final void play() {
		startGame();
		endGame();
	}

}
