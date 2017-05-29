package com.battleship.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.Function;

import com.battleship.model.BattleField;
import com.battleship.model.CordinateInfo;
import com.battleship.model.Player;
import com.battleship.model.Ship;
import com.battleship.model.ShipType;

public class PlayerBConvertor implements Function<Properties, Player> {

	Player playerB = new Player();

	@Override
	public Player apply(Properties prop) {
		return initplayerB(prop);
	}

	private Player initplayerB(Properties prop) {

		String fieldCordinate = prop.getProperty("area.boundries");
		String[] cordinateArray = fieldCordinate.split(",");
		BattleField field = new BattleField(Integer.valueOf(cordinateArray[0]), cordinateArray[1]);
		playerB.setId("player-2");
		playerB.setBattleField(field);
		playerB.setShipSet(getShipsForPlayerB(prop));
		String targets = prop.getProperty("missile.targets.playerB");
		playerB.setTargets(Arrays.asList(targets.split(",")));
		return playerB;

	}

	private Set<Ship> getShipsForPlayerB(Properties prop) {

		Set<Ship> shipSet = new HashSet<>();

		Ship ship1 = new Ship();
		ship1.setId(1);
		ShipType shipType1 = ShipType.valueOf(prop.getProperty("battleship1.type"));
		ship1.setShipType(shipType1);
		ship1.setDimensions(prop.getProperty("battleship1.dimension"));
		ship1.setLocation(prop.getProperty("battleship1.playerB.location"));
		ship1.setCordinates(getCordinates(ship1.getLocation(), ship1.getDimensions()));

		Ship ship2 = new Ship();
		ship2.setId(2);
		ShipType shipType2 = ShipType.valueOf(prop.getProperty("battleship2.type"));
		ship2.setShipType(shipType2);
		ship2.setDimensions(prop.getProperty("battleship2.dimension"));
		ship2.setLocation(prop.getProperty("battleship2.playerB.location"));
		ship2.setCordinates(getCordinates(ship2.getLocation(), ship2.getDimensions()));

		shipSet.add(ship1);
		shipSet.add(ship2);
		Map<String, CordinateInfo> cordinates = new HashMap<>();
		for (String cordinate : ship1.getCordinates()) {
			cordinates.put(cordinate, new CordinateInfo(ship1.getShipType()));
		}
		for (String cordinate : ship2.getCordinates()) {
			cordinates.put(cordinate, new CordinateInfo(ship2.getShipType()));
		}
		playerB.setCordinates(cordinates);

		return shipSet;

	}

	private List<String> getCordinates(String location, String dimensions) {
		List<String> cordinateList = new ArrayList<>();
		String[] dimensionArray = dimensions.split(",");
		int xCordinate = Integer.valueOf(dimensionArray[0]);
		int yCordinate = Integer.valueOf(dimensionArray[1]);
		char c = location.charAt(0);
		int x = Integer.valueOf(location.substring(1));
		for (int i = 0; i < yCordinate; i++) {

			for (int j = x, k = 1; k <= xCordinate; k++) {
				cordinateList.add(String.join("", String.valueOf(c), String.valueOf(j)));
				j++;
			}

			c++;
		}
		return cordinateList;
	}

}
