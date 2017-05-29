package com.battleship.model;

public class CordinateInfo {

	private final ShipType shipType;

	private Integer hitCount;

	public CordinateInfo(ShipType shipType) {
		this.shipType = shipType;
	}

	/**
	 * @return the hitCount
	 */
	public Integer getHitCount() {
		return hitCount;
	}

	/**
	 * @param hitCount
	 *            the hitCount to set
	 */
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	/**
	 * @return the shipType
	 */
	public ShipType getShipType() {
		return shipType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CordinateInfo [shipType=").append(shipType).append(", hitCount=").append(hitCount).append("]");
		return builder.toString();
	}

}
