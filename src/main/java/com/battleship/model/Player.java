package com.battleship.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Player {
	private String id;
	private BattleField battleField;
	private Set<Ship> shipSet;
	private List<String> targets;
	private Map<String, CordinateInfo> cordinates;
	private boolean isDone;

	/**
	 * @return the battleField
	 */
	public BattleField getBattleField() {
		return battleField;
	}

	/**
	 * @param battleField
	 *            the battleField to set
	 */
	public void setBattleField(BattleField battleField) {
		this.battleField = battleField;
	}

	/**
	 * @return the shipSet
	 */
	public Set<Ship> getShipSet() {
		return shipSet;
	}

	/**
	 * @param shipSet
	 *            the shipSet to set
	 */
	public void setShipSet(Set<Ship> shipSet) {
		this.shipSet = shipSet;
	}

	/**
	 * @return the targets
	 */
	public List<String> getTargets() {
		return targets;
	}

	/**
	 * @param targets
	 *            the targets to set
	 */
	public void setTargets(List<String> targets) {
		this.targets = targets;
	}

	/**
	 * @return the cordinates
	 */
	public Map<String, CordinateInfo> getCordinates() {
		return cordinates;
	}

	/**
	 * @param cordinates
	 *            the cordinates to set
	 */
	public void setCordinates(Map<String, CordinateInfo> cordinates) {
		this.cordinates = cordinates;
	}

	/**
	 * @return the isDone
	 */
	public boolean isDone() {
		return isDone;
	}

	/**
	 * @param isDone
	 *            the isDone to set
	 */
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [id=").append(id).append(", battleField=").append(battleField).append(", shipSet=")
				.append(shipSet).append(", targets=").append(targets).append(", cordinates=").append(cordinates)
				.append(", isDone=").append(isDone).append("]");
		return builder.toString();
	}

}
