/**
 * 
 */
package com.battleship.model;

import java.util.List;

/**
 * @author vaga21
 *
 */
public class Ship {

	private int id;

	private ShipType shipType;

	private String dimensions;

	private String location;

	private List<String> cordinates;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the shipType
	 */
	public ShipType getShipType() {
		return shipType;
	}

	/**
	 * @param shipType
	 *            the shipType to set
	 */
	public void setShipType(ShipType shipType) {
		this.shipType = shipType;
	}

	/**
	 * @return the dimensions
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * @param dimensions
	 *            the dimensions to set
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the cordinates
	 */
	public List<String> getCordinates() {
		return cordinates;
	}

	/**
	 * @param cordinates
	 *            the cordinates to set
	 */
	public void setCordinates(List<String> cordinates) {
		this.cordinates = cordinates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ship [id=").append(id).append(", shipType=").append(shipType).append(", dimensions=")
				.append(dimensions).append(", location=").append(location).append(", cordinates=").append(cordinates)
				.append("]");
		return builder.toString();
	}

}
