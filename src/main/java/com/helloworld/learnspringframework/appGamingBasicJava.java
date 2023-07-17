package com.helloworld.learnspringframework;

import com.helloworld.learnspringframework.game.GameRunner;
import com.helloworld.learnspringframework.game.MarioGame;
import com.helloworld.learnspringframework.game.PacmanGame;
import com.helloworld.learnspringframework.game.SuperContraGame;

public class appGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
