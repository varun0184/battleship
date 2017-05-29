package com.battleship.facade;

import java.util.Properties;

import com.battleship.api.GameManager;
import com.battleship.context.Context;
import com.battleship.impl.GameService;
import com.battleship.model.Player;
import com.battleship.util.InputConvertor;
import com.battleship.util.InputMapper;
import com.battleship.util.PlayerAConvertor;
import com.battleship.util.PlayerBConvertor;
import com.battleship.util.Validator;

public class GameManagerImpl implements GameManager {

	private final GameService gameService;

	public GameManagerImpl() {
		gameService = new GameService();
	}

	@Override
	public Player getPlayerB(Properties prop) {
		return InputMapper.transform(prop, new PlayerBConvertor());
	}

	@Override
	public Player getPlayerA(Properties prop) {

		return InputMapper.transform(prop, new PlayerAConvertor());
	}

	@Override
	public Properties getInput(Context context) {
		Properties prop = InputMapper.transform(context, new InputConvertor());
		return prop;
	}

	@Override
	public void startGame(Player playerA, Player playerB) {
		gameService.startGame(playerA, playerB);

	}

	@Override
	public void validateInput(Player playerA, Player playerB) {
		new Validator().accept(playerA, playerB);

	}

}
