package com.battleship.context;

import java.io.File;

public class BattleShipContext extends Context {

	private File battleShipFile;

	/**
	 * @return the battleShipFile
	 */
	public File getBattleShipFile() {
		return battleShipFile;
	}

	/**
	 * @param battleShipFile
	 *            the battleShipFile to set
	 */
	public void setBattleShipFile(File battleShipFile) {
		this.battleShipFile = battleShipFile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BattleShipContext [battleShipFile=").append(battleShipFile).append("]");
		return builder.toString();
	}

}
