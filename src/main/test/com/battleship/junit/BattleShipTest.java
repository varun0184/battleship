package com.battleship.junit;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.battleship.api.Game;
import com.battleship.context.BattleShipContext;
import com.battleship.impl.GameController;

public class BattleShipTest {
	
	private BattleShipContext context;
	private Game game;
	
	@Before
	public void init() {
		
		context = new BattleShipContext();
		context.setProcessId(1);
		context.setProcessDesc("battleship");
		context.setStatus(true);
	
	}
	
	
	@Test
	public void successTest1() {
		context.setBattleShipFile(new File("config/battleship_test1.txt"));
		game = new GameController();
		game.play(context);
	}
	
	@Test
	public void successTest2() {
		context.setBattleShipFile(new File("config/battleship_test2.txt"));
		game = new GameController();
		game.play(context);
	}
	
	@Test
	public void successTest3() {
		context.setBattleShipFile(new File("config/battleship_test3.txt"));
		game = new GameController();
		game.play(context);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void FailureTest() {
		context.setBattleShipFile(new File("config/battleship_test4.txt"));
		game = new GameController();
		game.play(context);
	}

}
