package com.battleship.context;

public abstract class Context {

	private boolean status = false;
	private int processId;
	private String processDesc;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Context [status=").append(status).append(", processId=").append(processId)
				.append(", processDesc=").append(processDesc).append("]");
		return builder.toString();
	}

}
