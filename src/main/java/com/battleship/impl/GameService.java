/**
 * 
 */
package com.battleship.impl;

import java.util.Map;

import com.battleship.model.CordinateInfo;
import com.battleship.model.Player;
import com.battleship.model.Ship;
import com.battleship.model.ShipType;

/**
 * @author vaga21
 *
 */
public class GameService {

	boolean isGameOn = true;

	public void startGame(Player playerA, Player playerB) {

		boolean isPlay = true;
		boolean isHit = false;

		int playerACount = playerA.getTargets().size();
		int playerBCount = playerB.getTargets().size();
		;

		for (int i = 0, j = 0, k = 0; i < playerACount + playerBCount; i++) {
			if (isGameOn) {
				if ((isPlay && j < playerACount) || (k >= playerBCount)) {

					String target = playerA.getTargets().get(j++);
					isPlay = player1Turn(target, playerA, playerB);

					if (k >= playerBCount && !isPlay) {
						System.out.println("Player-2 no more missiles left");
					}

				} else if (k < playerB.getTargets().size()) {


					String target = playerB.getTargets().get(k++);
					isHit = player2Turn(target, playerB, playerA);
					isPlay = !isHit;

					if (j >= playerACount && !isHit) {
						System.out.println("Player-1 no more missiles left");
					}
				}

			}
		}
		if (isGameOn) {
			System.out.println("Lets call it peace");
		}
	}

	private boolean player2Turn(String target, Player playerB, Player playerA) {
		return shoot(target, playerB, playerA);

	}

	private boolean player1Turn(String target, Player playerA, Player playerB) {
		return shoot(target, playerA, playerB);

	}

	private boolean shoot(String target, Player playerX, Player playerY) {
		boolean isShoot = false;
		Map<String, CordinateInfo> cordinateMap = playerY.getCordinates();

		for (Ship ship : playerY.getShipSet()) {
			if (ship.getCordinates().contains(target)) {
				CordinateInfo cordinateInfo = cordinateMap.get(target);
				if (cordinateInfo != null && cordinateInfo.getShipType() == ShipType.P) {
					playerY.getCordinates().remove(target);
					isShoot = true;
					break;
				} else {
					if (cordinateInfo != null && cordinateInfo.getHitCount() != null
							&& cordinateInfo.getHitCount() == 1) {
						playerY.getCordinates().remove(target);
						isShoot = true;
						break;
					} else if (playerY.getCordinates().containsKey(target)) {
						CordinateInfo info = playerY.getCordinates().get(target);
						info.setHitCount(1);
						isShoot = true;
						break;
					}
				}
			}

		}

		if (isShoot) {
			System.out.println(playerX.getId() + " fires a missile with target " + target + " which hit");
		} else {
			System.out.println(playerX.getId() + " fires a missile with target " + target + " which misses");
		}
		if (cordinateMap.isEmpty()) {
			System.out.println(playerX.getId() + " won the battle");
			isGameOn = false;

		}
		return isShoot;

	}

}
