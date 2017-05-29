package com.battleship.model;

public final class BattleField {

	private final int x;
	private final String y;

	public BattleField(int x, String y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public String getY() {
		return y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BattleField [x=").append(x).append(", y=").append(y).append("]");
		return builder.toString();
	}

}
