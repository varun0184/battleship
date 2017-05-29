package com.battleship.client;

import java.io.File;

import com.battleship.api.Game;
import com.battleship.context.BattleShipContext;
import com.battleship.impl.GameController;

public class MainClass {

	private static String battleShipFile = "config/battleship.txt";

	static BattleShipContext context = null;

	public static void main(String[] args) {

		context = new BattleShipContext();
		context.setProcessId(1);
		context.setProcessDesc("battleship");
		context.setStatus(true);
		context.setBattleShipFile(new File(battleShipFile));

		Game game = new GameController();
		game.play(context);

	}

}
