package com.in28minutesRogelio.learmspringframework;

import com.in28minutesRogelio.learmspringframework.game.GameRunner;
import com.in28minutesRogelio.learmspringframework.game.MarioGame;

public class AppGamingBasicJavA {
 public static void main(String[] args) {
var marioGame = new MarioGame();
var gameRunner = new GameRunner(marioGame);
gameRunner.run();

}

}
