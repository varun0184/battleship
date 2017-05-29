package com.battleship.api;

import java.util.Properties;

import com.battleship.context.Context;
import com.battleship.model.Player;

public interface GameManager {

	Properties getInput(Context context);

	Player getPlayerA(Properties prop);

	Player getPlayerB(Properties prop);

	void validateInput(Player playerA, Player playerB);

	void startGame(Player playerA, Player playerB);

	default void manageGame(Context context) {
		Properties prop = getInput(context);
		Player playerA = getPlayerA(prop);
		Player playerB = getPlayerB(prop);
		validateInput(playerA, playerB);
		startGame(playerA, playerB);
	}

}
