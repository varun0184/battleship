package com.battleship.impl;

import com.battleship.api.Game;
import com.battleship.context.Context;
import com.battleship.facade.GameManagerImpl;

public class GameController implements Game {

	private GameManagerImpl gameManager;

	public GameController() {
		gameManager = new GameManagerImpl();
	}

	@Override
	public void play(Context context) {

		gameManager.manageGame(context);

	}

}
