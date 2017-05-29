package com.battleship.util;

import java.util.function.BiConsumer;

import com.battleship.model.BattleField;
import com.battleship.model.Player;

public class Validator implements BiConsumer<Player, Player> {

	@Override
	public void accept(Player playerA, Player playerB) {
		boolean isValid = true;
		BattleField filed = playerA.getBattleField();
		int battleFieldX = filed.getX();
		String battleFieldY = filed.getY();
		Character c = battleFieldY.charAt(0);
		if (battleFieldX <= 1 || battleFieldX >= 9) {
			isValid = false;
		} else if (c <= 'A' || c >= 'Z') {
			isValid = false;
		}

		if (!isValid) {
			throw new IllegalArgumentException("provided input is not valid");
		}

	}

}
