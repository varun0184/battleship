package com.battleship.model;

public enum ShipType {

	P(1), Q(2);

	private int hitCapability;

	ShipType(int hitCapability) {

		this.hitCapability = hitCapability;

	}

	public int getHitCapability() {
		return hitCapability;
	}
}
